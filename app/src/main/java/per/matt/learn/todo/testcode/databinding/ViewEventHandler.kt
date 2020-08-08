package per.matt.learn.todo.testcode.databinding

import android.util.Log
import android.view.View
import android.widget.Toast

class ViewEventHandler {
    fun testClick(view:View ,user: User){

        Toast.makeText(view.context,"first name:"+user.firstName,Toast.LENGTH_SHORT).show()
    }
}