#!/usr/bin/bash

##
path=`date -d -1days +%Y%m%d`

/opt/cdh/hive-1.1.0-cdh5.9.3/bin/hive -e "load data local inpath '/opt/my_project_file/201912/TM_ItemList_CW_${path}.csv' overwrite into table default.tm_itemlist partition(day='${path}')";
/opt/cdh/hive-1.1.0-cdh5.9.3/bin/hive -e "load data local inpath '/opt/my_project_file/201912/TM_ItemList_GQ_${path}.csv' overwrite into table default.tm_itemlist partition(day='${path}')";
/opt/cdh/hive-1.1.0-cdh5.9.3/bin/hive -e "load data local inpath '/opt/my_project_file/201912/TM_OrderList_CW_${path}.csv' overwrite into table default.tm_orderlist partition(day='${path}')";
/opt/cdh/hive-1.1.0-cdh5.9.3/bin/hive -e "load data local inpath '/opt/my_project_file/201912/TM_OrderList_GQ_${path}.csv' overwrite into table default.tm_orderlist partition(day='${path}')";
/opt/cdh/hive-1.1.0-cdh5.9.3/bin/hive -e "load data local inpath '/opt/my_project_file/201912/TM_Return_CW_${path}.csv' overwrite into table default.tm_return partition(day='${path}')";
/opt/cdh/hive-1.1.0-cdh5.9.3/bin/hive -e "load data local inpath '/opt/my_project_file/201912/TM_Return_GQ_${path}.csv' overwrite into table default.tm_return partition(day='${path}')";


/opt/cdh/hive-1.1.0-cdh5.9.3/bin/hive -f tm_hive2.sql