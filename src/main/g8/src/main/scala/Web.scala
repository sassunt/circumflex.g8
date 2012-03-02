package $organization$

import ru.cirucumflex._
import ru.cirucumflex.core._
import ru.cirucumflex.freemarker._
import ru.cirucumflex.web._

class MyRouter extends Router {
    get("/") = "<h1>it works!</h1>"

    get("/freemarker") = {
      object simpleObject {
        val name = "Joe"
        val subobj = new Object {
          val name = "Smith"
        }
        override def toString = name + " " + subobj.name
      }
      'obj:= simpleObject
      ftl("index.ftl")
    }
}
