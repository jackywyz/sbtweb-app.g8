package com.test
import javax.servlet.http._
import javax.servlet._
import org.slf4j.LoggerFactory

trait ConfigHttp{self:HttpServlet =>
 import java.io.PrintWriter
 def config(req:HttpServletRequest,res:HttpServletResponse):PrintWriter = {
   req.setCharacterEncoding("UTF-8")
   res.setContentType("text/plain; charset=UTF-8")
   res.getWriter()
  }
 def resp(out:PrintWriter,res:String="") = {
   out.write(res) 
   out.close()
 }
 override def doPost(req:HttpServletRequest,res:HttpServletResponse)={
   self.doGet(req,res)
 }
}

class Stub extends  HttpServlet with ConfigHttp{
  def logger = LoggerFactory.getLogger("web")
 override def doGet(req:HttpServletRequest,res:HttpServletResponse)={ 
   logger.info("link request")
 }
}
