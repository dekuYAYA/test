insert overwrite table Info_Member select t.`买家会员名`,t.`买家支付宝账号`,t.`收货人姓名`,t.`收货地址`,t.`联系电话`,t.`联系手机` from ( select `买家会员名`,`买家支付宝账号`,`收货人姓名`,`收货地址`,`联系电话`,`联系手机` ,`订单创建时间`,row_number() over(distribute by `买家会员名` sort by `订单创建时间` desc) as row from TM_OrderList) t where t.row=1;

insert overwrite table default.Info_Order select `订单编号`,`总金额`,`买家实际支付金额`,`订单状态`,`订单创建时间`,`订单付款时间`,`宝贝标题`,`宝贝种类`,`店铺Id`,`店铺名称`,`确认收货时间`,`买家会员名` from default.TM_OrderList ;
insert overwrite table JYJELSB select `买家会员名`,`订单编号`,`买家实际支付金额` from default.TM_OrderList where `订单状态`='交易成功';
insert overwrite table default.TKJELSB select `买家会员名称`,`退款编号`, `买家退款金额`,`订单编号` from default.TM_Return where `退款状态`='退款成功';

insert overwrite table default.MAITUILSB select member_name,orderid,actual_amount from default.JYJELSB where Actual_Amount>10;

insert into table default.MAITUILSB select member_name,OrderID ,Refund_Amount*-1 from default.TKJELSB  where Refund_Amount >10;

insert overwrite table default.Member_Deal select Member_Name,sum(Money)*100 as Money from default.MAITUILSB group by Member_Name;
insert overwrite table default.Member_Points select Member_Name,Integral from default.Member_Deal where Integral >=0;

insert overwrite table Member_Grade select Member_Name,case when Member_Points >0 and Member_Points<=200000 then '普通会员' when Member_Points>200000 and Member_Points<=500000 then '银卡会员' else '金卡会员' end from default.Member_Points;

insert overwrite table default.All_FK select Member_Name,sum(Actual_Amount) from default.JYJELSB group by Member_Name;

insert overwrite table default.All_TK select Member_Name,sum(Refund_Amount) from default.TKJELSB group by Member_Name;

insert overwrite table default.Rf_Info_User select a.Member_Name,a.Contact_Phone,b.Member_Points,c.Member_Grade,e.Amount_Trade,d.Refund_Amount from default.Info_Member a left join Member_Points b on a.Member_Name = b.Member_Name left join Member_Grade c on a.Member_Name = c.Member_Name left join All_FK e on a.Member_Name =e.Member_Name left join All_TK d on a.Member_Name=d.Member_Name;

insert overwrite table Rf_Info_Order select a.Member_Name,a.OrderID,a.Baby_Title,b.`商家编码`,b.`价格`,b.`购买数量`,a.OrderState from default.Info_Order a left join TM_ItemList b on a.OrderID = b.`订单编号`;

insert overwrite table Rf_Info_Refund select `买家会员名称`,`退款编号`,`订单编号`,`宝贝标题`,`退款的申请时间`,`退款完结时间`, `买家实际支付金额`,`买家退款金额`,`退款状态`,`买家退款原因` from default.TM_Return;

