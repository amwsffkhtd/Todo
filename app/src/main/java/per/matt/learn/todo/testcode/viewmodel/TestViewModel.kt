package per.matt.learn.todo.testcode.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import per.matt.learn.todo.testcode.bean.LiveDataUser
import per.matt.learn.todo.testcode.bean.ObservableUser
import per.matt.learn.todo.testcode.bean.User

class TestViewModel : ViewModel(){
    init {
        Log.d("vlog","init")
    }

    override fun onCleared() {
        super.onCleared()
        Log.d("vlog","onCleared")
    }
    private val mUser:User by lazy {
        User("jack","ma")
    }

    fun getUser():User{
        return mUser
    }

    fun setUser(_firstName:String,_lastName:String){
        mUser.firstName = _firstName
        mUser.lastName = _lastName
    }

    private val mObservableUser:ObservableUser by lazy {
        ObservableUser("jack","ma",20)
    }

    fun getObservableUser():ObservableUser{
        return mObservableUser
    }

    fun setObservableUser(_firstName:String,_lastName:String,_age:Int){
        mObservableUser.firstName.set(_firstName)
        mObservableUser.lastName.set(_lastName)
        mObservableUser.age.set(_age)
    }

    private val mLiveDataUser:LiveDataUser by lazy {
        LiveDataUser("Hennie","M",20)
    }

    fun getLiveDataUser():LiveDataUser{
        return mLiveDataUser
    }

    fun setLiveDataUser(_firstName:String,_lastName:String,_age:Int){
        mLiveDataUser.firstName.value=_firstName
        mLiveDataUser.lastName.value=_lastName
        mLiveDataUser.age.value=_age
    }

}