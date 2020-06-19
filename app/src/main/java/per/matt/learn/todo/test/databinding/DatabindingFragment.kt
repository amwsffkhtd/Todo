package per.matt.learn.todo.test.databinding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_databinding.view.*
import per.matt.learn.todo.databinding.FragmentDatabindingBinding


private lateinit var binding: FragmentDatabindingBinding
private lateinit var mUser:User


class DatabindingFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDatabindingBinding.inflate(inflater,container,false)
        mUser =  User("aaaaa", "bbbbbb")
        binding.user =  mUser

        binding.root.btn_test.setOnClickListener({
            binding.user  = User("cccc", "ddddd")
        })

        return binding.root;
    }
}