<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="/common/meta.jsp" %>
<%@include file="/common/include_js.jsp" %>



        <!-- Content Header (Page header) -->
        <section class="content-header">
          <h1>
            系统菜单
            <small>advanced tables</small>
          </h1>
          <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
            <li><a href="#">系统菜单</a></li>
            <li class="active">Data tables</li>
          </ol>
        </section>

        <!-- Main content -->
        <section class="content">
          <div class="row">
            <div class="col-xs-12">
              <div class="box">
                <div class="box-header">
                  <h3 class="box-title">Hover Data Table</h3>
                </div><!-- /.box-header -->
                <div class="box-body">
                  <table id="example2" class="table table-bordered table-hover">
                    <thead>
                      <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>URL</th>
                        <th>序号</th>
                        <th>操作</th>
                      </tr>
                    </thead>
                    
                    <tbody>
                    <c:forEach items="${menus }" var="m">
                    
                    
                      <tr>
                        <td>${m.id }</td>
                        <td>${m.mName }</td>
                        <td>${m.mUrl }</td>
                        <td>${m.mOrder }</td>
                        <td>X</td>
                      </tr>
                      
					</c:forEach>
                    </tbody>
                    
                    
                    <tfoot>
                      <tr>
                        <th>Rendering engine</th>
                        <th>Browser</th>
                        <th>Platform(s)</th>
                        <th>Engine version</th>
                        <th>CSS grade</th>
                      </tr>
                    </tfoot>
                  </table>
                </div><!-- /.box-body -->
              </div><!-- /.box -->

              
            </div><!-- /.col -->
          </div><!-- /.row -->
        </section><!-- /.content -->
      

