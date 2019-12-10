<template>
  <div class="layout">
    <Layout>
      <Header>
        <Menu mode="horizontal" theme="dark" active-name="1">

          <div class="layout-nav">
            <MenuItem name="1">
              <Icon type="ios-navigate"></Icon>
              <a @click="toURL()">会员信息表</a>
            </MenuItem>
            <MenuItem name="2">
              <Icon type="ios-keypad"></Icon>
              订单信息表
            </MenuItem>
          </div>
        </Menu>
      </Header>
      <Content :style="{padding: '2px 50px'}">
        <Breadcrumb :style="{margin: '10px 0'}">
          <BreadcrumbItem>西门子天猫交易信息</BreadcrumbItem>
          <BreadcrumbItem>订单信息概况</BreadcrumbItem>
        </Breadcrumb>
        <Card>
          <div style="min-height: 200px;">
            <v-table
              is-horizontal-resize
              style="width:100%"
              :columns="columns"
              :tableData="tableData"
              row-hover-color="#eee"
              row-click-color="#edf7ff"
            ></v-table>
          </div>
        </Card>
      </Content>
      <Footer class="layout-footer-center"> </Footer>
    </Layout>
  </div>
</template>

<script>
  export default {
    name: "table-Order",
    data() {
      return {
        tableData: [],
        columns: [
          {
            field: 'member_Name',
            title: '买家会员名',
            width: 80,
            titleAlign: 'center',
            columnAlign: 'center',
            isResize: true
          },
          {
            field: 'orderID',
            title: '订单编号',
            width: 80,
            titleAlign: 'center',
            columnAlign: 'center',
            isResize: true
          },
          {
            field: 'baby_Title',
            title: '宝贝标题',
            width: 300,
            titleAlign: 'center',
            columnAlign: 'center',

            isResize: true
          },
          {
            field: 'storeId',
            title: '商家编码',
            width: 110,
            titleAlign: 'center',
            columnAlign: 'center',
            isResize: true
          },
          {
            field: 'price',
            title: '价格',
            width: 20,
            titleAlign: 'center',
            columnAlign: 'center',
            isResize: true
          },
          {
            field: 'buy_Quantity',
            title: '购买数量',
            width: 10,
            titleAlign: 'center',
            columnAlign: 'center',
            isResize: true
          },
          {
            field: 'orderState',
            title: '订单状态',
            width: 100,
            titleAlign: 'center',
            columnAlign: 'center',
            isResize: true
          }
        ]
      }
    },
    //在实例创建完成后被立即调用
    created(){
      this.getTableData()
    },
    //methods 方法中的 this 自动绑定为 Vue 实例。
    methods: {
      getTableData() {
        // 发ajax请求，用以获取数据
        this.$ajax('http://localhost:8080/get_My_Info_Order/getOrder',).then(res => {
          this.tableData = res.data
          console.log(res.data);
        }).catch(function (error) {
          console.log(error);
        });
      },
      // routerTo(){
      //   this.$router.push({path:'/User'})
      // },
      toURL(){
        this.$router.push({path:'/'})
      }
    }
  }
</script>

<style>
  .layout{
    border: 1px solid #d7dde4;
    background: #f5f7f9;
    position: relative;
    border-radius: 10px;
    overflow: hidden;
    height: 100%;
  }
  .layout-logo{
    width: 100px;
    height: 30px;
    background: #5b6270;
    border-radius: 3px;
    float: left;
    position: relative;
    top: 15px;
    left: 20px;
    font-weight: bold;
    text-align: center;
    color: #49ffcc;
  }
  .layout-nav{
    width: 420px;
    margin: 0 auto;
    margin-right: 20px;
  }
  .layout-footer-center{
    text-align: center;
  }
</style>
