<template>
  <!--template 是用一个字符串模板作为 Vue 实例的标识使用，类似于定义一个 html 标签。-->
  <div class="layout">
    <Layout>
      <Header>
        <Menu mode="horizontal" theme="dark" active-name="1">

          <div class="layout-nav">
            <MenuItem name="1">
              <Icon type="ios-navigate"></Icon>
             会员信息表
            </MenuItem>
            <MenuItem name="2">
              <Icon type="ios-keypad"></Icon>
              <a @click="toURL()">订单信息表</a>
            </MenuItem>
          </div>
        </Menu>
      </Header>
      <Content :style="{padding: '0 50px'}">
        <Breadcrumb :style="{margin: '20px 0'}">
          <BreadcrumbItem>西门子天猫交易信息</BreadcrumbItem>
          <BreadcrumbItem>会员信息概况</BreadcrumbItem>
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
    name: "table-main",
    data() {
      return {
        tableData: [],
        columns: [
          {
            field: 'member_Name',
            title: '买家会员名',
            width: 100,
            titleAlign: 'center',
            columnAlign: 'center',
            isResize: true
          },
          {
            field: 'contact_Phone',
            title: '联系手机',
            width: 80,
            titleAlign: 'center',
            columnAlign: 'center',
            isResize: true
          },
          {
            field: 'member_Points',
            title: '用户总积分',
            width: 80,
            titleAlign: 'center',
            columnAlign: 'center',
            isResize: true
          },
          {
            field: 'member_Grade',
            title: '会员等级',
            width: 130,
            titleAlign: 'center',
            columnAlign: 'center',
            isResize: true
          },
          {
            field: 'amount_Trade',
            title: '交易总额',
            width: 150,
            titleAlign: 'center',
            columnAlign: 'center',
            isResize: true
          },
          {
            field: 'refund_Amount',
            title: '退款总额 ',
            width: 150,
            titleAlign: 'center',
            columnAlign: 'center',
            isResize: true
          }
        ]
      }
    },
created(){
      this.getTableData()
  },

    methods:{
      getTableData() {
        //在created函数中使用axios的get请求向后台获取用户信息数据
        this.$ajax('http://localhost:8080/get_My_Info_User/getUser').then(res => {
            this.tableData=res.data
          console.log(res.data);
        }).catch(function (error) {
          console.log(error);
        });
      },
      toURL(){
        this.$router.push({path: '/Order'})
      }
    }
  }
</script>

<style scoped>
  .layout{
    border: 1px solid #d7dde4;
    background: #f5f7f9;
    position: relative;
    border-radius: 4px;
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
