// @SOURCE:/home/byer/haha/Amaze_Play_Framework-master/conf/routes
// @HASH:52b6b9c5abdc24732af39aed98fda46e1ce0245b
// @DATE:Sat May 27 15:11:18 CST 2017

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:57
// @LINE:52
// @LINE:50
// @LINE:48
// @LINE:46
// @LINE:44
// @LINE:42
// @LINE:40
// @LINE:38
// @LINE:36
// @LINE:34
// @LINE:32
// @LINE:30
// @LINE:28
// @LINE:26
// @LINE:24
// @LINE:22
// @LINE:20
// @LINE:18
// @LINE:16
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:6
package controllers {

// @LINE:57
class ReverseAssets {
    

// @LINE:57
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:52
// @LINE:50
// @LINE:48
// @LINE:46
// @LINE:44
// @LINE:42
// @LINE:40
// @LINE:38
// @LINE:36
// @LINE:34
// @LINE:32
// @LINE:30
// @LINE:28
// @LINE:26
// @LINE:24
// @LINE:22
// @LINE:20
// @LINE:18
// @LINE:16
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:6
class ReverseApplication {
    

// @LINE:40
def cart(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "checkout")
}
                                                

// @LINE:32
def postbusiness(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "business")
}
                                                

// @LINE:18
def edititem(id:Int = 0): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "edititem" + queryString(List(if(id == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("id", id)))))
}
                                                

// @LINE:30
def business(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "business")
}
                                                

// @LINE:10
def postregister(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "register")
}
                                                

// @LINE:14
def postlogin(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:44
def admin(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "admin")
}
                                                

// @LINE:42
def delcart(id:Int): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "delcart" + queryString(List(Some(implicitly[QueryStringBindable[Int]].unbind("id", id)))))
}
                                                

// @LINE:28
def postissue(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "issue")
}
                                                

// @LINE:36
def pass(id:Int): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "pass" + queryString(List(Some(implicitly[QueryStringBindable[Int]].unbind("id", id)))))
}
                                                

// @LINE:50
def deluser(username:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "deluser" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("username", username)))))
}
                                                

// @LINE:52
def delapply(id:Int): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "delapply" + queryString(List(Some(implicitly[QueryStringBindable[Int]].unbind("id", id)))))
}
                                                

// @LINE:46
def editissue(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "blog_single")
}
                                                

// @LINE:8
def register(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "register")
}
                                                

// @LINE:20
def postedititem(id:Int): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "postedititem/" + implicitly[PathBindable[Int]].unbind("id", id))
}
                                                

// @LINE:48
def buy(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "buy")
}
                                                

// @LINE:24
def postitem(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "item")
}
                                                

// @LINE:34
def postdiscuss(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "discuss")
}
                                                

// @LINE:26
def issue(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "blog")
}
                                                

// @LINE:16
def item(id:Int = 0): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "item" + queryString(List(if(id == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("id", id)))))
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:38
def addcart(id:Int, num:Int = 1): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "addcart" + queryString(List(Some(implicitly[QueryStringBindable[Int]].unbind("id", id)), if(num == 1) None else Some(implicitly[QueryStringBindable[Int]].unbind("num", num)))))
}
                                                

// @LINE:12
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:22
def delitem(id:Int): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "delitem" + queryString(List(Some(implicitly[QueryStringBindable[Int]].unbind("id", id)))))
}
                                                
    
}
                          
}
                  


// @LINE:57
// @LINE:52
// @LINE:50
// @LINE:48
// @LINE:46
// @LINE:44
// @LINE:42
// @LINE:40
// @LINE:38
// @LINE:36
// @LINE:34
// @LINE:32
// @LINE:30
// @LINE:28
// @LINE:26
// @LINE:24
// @LINE:22
// @LINE:20
// @LINE:18
// @LINE:16
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:6
package controllers.javascript {

// @LINE:57
class ReverseAssets {
    

// @LINE:57
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:52
// @LINE:50
// @LINE:48
// @LINE:46
// @LINE:44
// @LINE:42
// @LINE:40
// @LINE:38
// @LINE:36
// @LINE:34
// @LINE:32
// @LINE:30
// @LINE:28
// @LINE:26
// @LINE:24
// @LINE:22
// @LINE:20
// @LINE:18
// @LINE:16
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:6
class ReverseApplication {
    

// @LINE:40
def cart : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.cart",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "checkout"})
      }
   """
)
                        

// @LINE:32
def postbusiness : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.postbusiness",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "business"})
      }
   """
)
                        

// @LINE:18
def edititem : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.edititem",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "edititem" + _qS([(id == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("id", id))])})
      }
   """
)
                        

// @LINE:30
def business : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.business",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "business"})
      }
   """
)
                        

// @LINE:10
def postregister : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.postregister",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
      }
   """
)
                        

// @LINE:14
def postlogin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.postlogin",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:44
def admin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.admin",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin"})
      }
   """
)
                        

// @LINE:42
def delcart : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.delcart",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "delcart" + _qS([(""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:28
def postissue : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.postissue",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "issue"})
      }
   """
)
                        

// @LINE:36
def pass : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.pass",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pass" + _qS([(""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:50
def deluser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deluser",
   """
      function(username) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deluser" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("username", username)])})
      }
   """
)
                        

// @LINE:52
def delapply : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.delapply",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "delapply" + _qS([(""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:46
def editissue : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.editissue",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "blog_single"})
      }
   """
)
                        

// @LINE:8
def register : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.register",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
      }
   """
)
                        

// @LINE:20
def postedititem : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.postedititem",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "postedititem/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:48
def buy : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.buy",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "buy"})
      }
   """
)
                        

// @LINE:24
def postitem : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.postitem",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "item"})
      }
   """
)
                        

// @LINE:34
def postdiscuss : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.postdiscuss",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "discuss"})
      }
   """
)
                        

// @LINE:26
def issue : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.issue",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "blog"})
      }
   """
)
                        

// @LINE:16
def item : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.item",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "item" + _qS([(id == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("id", id))])})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:38
def addcart : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.addcart",
   """
      function(id,num) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addcart" + _qS([(""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("id", id), (num == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("num", num))])})
      }
   """
)
                        

// @LINE:12
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:22
def delitem : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.delitem",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "delitem" + _qS([(""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        
    
}
              
}
        


// @LINE:57
// @LINE:52
// @LINE:50
// @LINE:48
// @LINE:46
// @LINE:44
// @LINE:42
// @LINE:40
// @LINE:38
// @LINE:36
// @LINE:34
// @LINE:32
// @LINE:30
// @LINE:28
// @LINE:26
// @LINE:24
// @LINE:22
// @LINE:20
// @LINE:18
// @LINE:16
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:6
package controllers.ref {


// @LINE:57
class ReverseAssets {
    

// @LINE:57
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:52
// @LINE:50
// @LINE:48
// @LINE:46
// @LINE:44
// @LINE:42
// @LINE:40
// @LINE:38
// @LINE:36
// @LINE:34
// @LINE:32
// @LINE:30
// @LINE:28
// @LINE:26
// @LINE:24
// @LINE:22
// @LINE:20
// @LINE:18
// @LINE:16
// @LINE:14
// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:6
class ReverseApplication {
    

// @LINE:40
def cart(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.cart(), HandlerDef(this, "controllers.Application", "cart", Seq(), "GET", """""", _prefix + """checkout""")
)
                      

// @LINE:32
def postbusiness(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.postbusiness(), HandlerDef(this, "controllers.Application", "postbusiness", Seq(), "POST", """""", _prefix + """business""")
)
                      

// @LINE:18
def edititem(id:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.edititem(id), HandlerDef(this, "controllers.Application", "edititem", Seq(classOf[Int]), "GET", """""", _prefix + """edititem""")
)
                      

// @LINE:30
def business(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.business(), HandlerDef(this, "controllers.Application", "business", Seq(), "GET", """""", _prefix + """business""")
)
                      

// @LINE:10
def postregister(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.postregister(), HandlerDef(this, "controllers.Application", "postregister", Seq(), "POST", """""", _prefix + """register""")
)
                      

// @LINE:14
def postlogin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.postlogin(), HandlerDef(this, "controllers.Application", "postlogin", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:44
def admin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.admin(), HandlerDef(this, "controllers.Application", "admin", Seq(), "GET", """""", _prefix + """admin""")
)
                      

// @LINE:42
def delcart(id:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.delcart(id), HandlerDef(this, "controllers.Application", "delcart", Seq(classOf[Int]), "GET", """""", _prefix + """delcart""")
)
                      

// @LINE:28
def postissue(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.postissue(), HandlerDef(this, "controllers.Application", "postissue", Seq(), "POST", """""", _prefix + """issue""")
)
                      

// @LINE:36
def pass(id:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.pass(id), HandlerDef(this, "controllers.Application", "pass", Seq(classOf[Int]), "GET", """""", _prefix + """pass""")
)
                      

// @LINE:50
def deluser(username:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deluser(username), HandlerDef(this, "controllers.Application", "deluser", Seq(classOf[String]), "GET", """""", _prefix + """deluser""")
)
                      

// @LINE:52
def delapply(id:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.delapply(id), HandlerDef(this, "controllers.Application", "delapply", Seq(classOf[Int]), "GET", """""", _prefix + """delapply""")
)
                      

// @LINE:46
def editissue(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.editissue(), HandlerDef(this, "controllers.Application", "editissue", Seq(), "GET", """""", _prefix + """blog_single""")
)
                      

// @LINE:8
def register(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.register(), HandlerDef(this, "controllers.Application", "register", Seq(), "GET", """""", _prefix + """register""")
)
                      

// @LINE:20
def postedititem(id:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.postedititem(id), HandlerDef(this, "controllers.Application", "postedititem", Seq(classOf[Int]), "POST", """""", _prefix + """postedititem/$id<[^/]+>""")
)
                      

// @LINE:48
def buy(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.buy(), HandlerDef(this, "controllers.Application", "buy", Seq(), "GET", """""", _prefix + """buy""")
)
                      

// @LINE:24
def postitem(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.postitem(), HandlerDef(this, "controllers.Application", "postitem", Seq(), "POST", """""", _prefix + """item""")
)
                      

// @LINE:34
def postdiscuss(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.postdiscuss(), HandlerDef(this, "controllers.Application", "postdiscuss", Seq(), "POST", """""", _prefix + """discuss""")
)
                      

// @LINE:26
def issue(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.issue(), HandlerDef(this, "controllers.Application", "issue", Seq(), "GET", """""", _prefix + """blog""")
)
                      

// @LINE:16
def item(id:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.item(id), HandlerDef(this, "controllers.Application", "item", Seq(classOf[Int]), "GET", """""", _prefix + """item""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:38
def addcart(id:Int, num:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.addcart(id, num), HandlerDef(this, "controllers.Application", "addcart", Seq(classOf[Int], classOf[Int]), "GET", """""", _prefix + """addcart""")
)
                      

// @LINE:12
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq(), "GET", """""", _prefix + """login""")
)
                      

// @LINE:22
def delitem(id:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.delitem(id), HandlerDef(this, "controllers.Application", "delitem", Seq(classOf[Int]), "GET", """""", _prefix + """delitem""")
)
                      
    
}
                          
}
        
    