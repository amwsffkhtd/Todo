package per.matt.learn.todo.testcode.databinding

import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.databinding.ObservableField

class ViewEventHandler {
    fun testClick(view:View ,user: User){
        user.firstName = "Matt"
        Toast.makeText(view.context,"first name:"+user.firstName,Toast.LENGTH_SHORT).show()
    }

    fun observableClick(view:View,user: ObservableUser){
        user.firstName.set("Handsome")
        Toast.makeText(view.context,"first name:"+user.firstName.get(),Toast.LENGTH_SHORT).show()
    }
}