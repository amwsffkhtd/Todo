package per.matt.learn.todo.testcode.bean

import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt

class ObservableUser(_firstName:String="Matt",_lastName:String="Huang",_age:Int = 0) {
    var firstName = ObservableField<String>(_firstName)
    var lastName = ObservableField<String>(_lastName)
    var age = ObservableInt(_age)
}