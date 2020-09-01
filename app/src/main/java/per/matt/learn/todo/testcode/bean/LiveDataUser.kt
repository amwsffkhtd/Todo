package per.matt.learn.todo.testcode.bean

import androidx.lifecycle.MutableLiveData

class LiveDataUser(_firstName: String = "Matt", _lastName: String = "Huang", _age: Int = 0) {
//    val firstName = MutableLiveData<String>(_firstName)
//    val lastName = MutableLiveData<String>(_lastName)
//    val age = MutableLiveData<Int>(_age)

    val firstName: MutableLiveData<String> by lazy { MutableLiveData<String>(_firstName) }
    val lastName = MutableLiveData<String>(_lastName)
    val age = MutableLiveData<Int>(_age)
}