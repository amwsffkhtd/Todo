package per.matt.learn.todo.testcode.databinding

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.ObservableInt
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_databinding.view.*
import per.matt.learn.todo.databinding.FragmentDatabindingBinding


private lateinit var binding: FragmentDatabindingBinding
private lateinit var mUser:User
private lateinit var mObservableUser: ObservableUser;
private lateinit var eventHandler: ViewEventHandler


class DatabindingFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        /**
         * where is the FragmentDatabindingBinding come from?
         * A binding class is generated for each layout file.
         * By default, the name of the class is based on the name of the layout file, converting it to Pascal case and adding the Binding suffix to it.
         */
        binding = FragmentDatabindingBinding.inflate(inflater,container,false)

        mUser =  User("dddddd","ffffff")
        mUser.lastName="gggggg"
        binding.user =  mUser

        mObservableUser = ObservableUser();
        mObservableUser.age.set(18)
        binding.observableUser = mObservableUser;

        eventHandler = ViewEventHandler();
        binding.handler = eventHandler;

//        binding.root.btn_test.setOnClickListener({
//            binding.user  = User("cccc", "ddddd")
//            Log.d("vlog","aaaaaa");
//        })

        return binding.root;
    }
}