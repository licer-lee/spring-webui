<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="/common/meta.jsp" %>
<%@include file="/common/include_js.jsp" %>



        <!-- Content Header (Page header) -->
        <section class="content-header">
          <h1>
            系统菜单
            <small></small>
          </h1>
          <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i> 首页</a></li>
            <li><a href="#">系统菜单</a></li>
            <li class="active">Data tables</li>
          </ol>
        </section>

        <!-- Main content -->
        <section class="content">
        
        <div class="row">
				<form class="form-horizontal col-md-12" id="i-form" name="from-name"
					method="post">
					<input type="hidden" id="menuId" name="menuId" /> <input
						type="hidden" id="i-pages" name="pages" value="1" />
					<div class="form-group">
						<label for="exampleInputEmail1" class="col-md-2  control-label">菜单名称</label>
						<div class="col-md-3">
							<input class="col-md-8 form-control" type="text"
								id="exampleInputEmail1" name="menuName" placeholder="菜单名称">
						</div>
						<label for="exampleInputEmail1" class="col-md-2 control-label">菜单级别</label>
						<div class="col-md-3">
							<!-- <input class="col-md-8 form-control" type="text" id="i-menuLevel"
								name="menuLevel" placeholder="菜单级别">
						 -->
						<select  name="menuLevel"   class="col-md-8 form-control">
							 ${codeData.levelHtml } 
						</select>
						</div>
						<div class="col-md-2">
							<button type="button" class="btn btn-primary "
								onclick="qryList()">
								<i class="icon-search"></i>查询
							</button>
						</div>
					</div>
				</form>
				<div class="col-md-12">
					<button type="button" class="btn btn-primary" onclick="openAdd()">
						<i class="icon-plus-sign"></i> 新增
					</button>
					<button type="button" class="btn btn-primary" onclick="updMenu()">
						<i class="icon-edit"></i> 修改
					</button>
					<button type="button" class="btn btn-primary" onclick="deleMenu()">
						<i class="icon-trash"></i> 删除
					</button>
				</div>
			</div>
			
          <div class="row">
            <div class="col-xs-12">
              <div class="box">
              
                <div class="box-header">
                  <h3 class="box-title">Hover Data Table</h3>
                </div><!-- /.box-header -->
              
                <div class="box-body">
                  
                  <table id="example2" class="table table-bordered table-hover"
                  	data-toggle="table" data-url="${ctx }/system/menu/list">
                    <thead>
                      <tr>
                        <th data-field="id">ID</th>
                        <th data-field="mName">Name</th>
                        <th data-field="mUrl">URL</th>
                        <th data-field="mOrder">序号</th>
                        <th data-field="id">操作</th>
                      </tr>
                    </thead>
                    
                    <%-- <tbody>
                    <c:forEach items="${menus }" var="m">
                    
                    
                      <tr>
                        <td>${m.id }</td>
                        <td>${m.mName }</td>
                        <td>${m.mUrl }</td>
                        <td>${m.mOrder }</td>
                        <td>X</td>
                      </tr>
                      
					</c:forEach>
                    </tbody> --%>
                    
                    
                  </table>
                </div><!-- /.box-body -->
              </div><!-- /.box -->

              
            </div><!-- /.col -->
          </div><!-- /.row -->
        </section><!-- /.content -->
      

