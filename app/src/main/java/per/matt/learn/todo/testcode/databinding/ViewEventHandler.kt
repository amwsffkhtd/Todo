package per.matt.learn.todo.testcode.databinding

import android.view.View
import android.widget.Toast
import per.matt.learn.todo.testcode.bean.ObservableUser
import per.matt.learn.todo.testcode.bean.User

class ViewEventHandler {
    fun testClick(view:View ,user: User){
        user.firstName = "Matt"
        Toast.makeText(view.context,"first name changed to:"+user.firstName,Toast.LENGTH_SHORT).show()
    }

    fun observableClick(view:View,user: ObservableUser){
        user.firstName.set("Handsome")
        Toast.makeText(view.context,"first name changed to:"+user.firstName.get(),Toast.LENGTH_SHORT).show()
    }
}