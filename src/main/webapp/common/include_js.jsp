<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" /> 


    <script src="${ctx}/static/plugins/jQuery/jQuery-2.1.4.min.js"></script>
    <script src="https://code.jquery.com/ui/1.11.4/jquery-ui.min.js"></script>
    <!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
    <script>
      $.widget.bridge('uibutton', $.ui.button);
    </script>
    
    <script src="${ctx}/static/bootstrap/js/bootstrap.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js"></script>
    <script src="${ctx}/static/plugins/morris/morris.min.js"></script>
    <script src="${ctx}/static/plugins/sparkline/jquery.sparkline.min.js"></script>
    <script src="${ctx}/static/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
    <script src="${ctx}/static/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
    <script src="${ctx}/static/plugins/knob/jquery.knob.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.10.2/moment.min.js"></script>
    <script src="${ctx}/static/plugins/daterangepicker/daterangepicker.js"></script>
    <script src="${ctx}/static/plugins/datepicker/bootstrap-datepicker.js"></script>
    <script src="${ctx}/static/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
    <script src="${ctx}/static/plugins/slimScroll/jquery.slimscroll.min.js"></script>
    <script src="${ctx}/static/plugins/fastclick/fastclick.min.js"></script>
    <script src="${ctx}/static/dist/js/app.min.js"></script>
    <script src="${ctx}/static/dist/js/pages/dashboard.js"></script>
    <script src="${ctx}/static/dist/js/demo.js"></script>
