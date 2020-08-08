package per.matt.learn.todo.task

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import per.matt.learn.todo.databinding.FragmentDatabindingBinding
import per.matt.learn.todo.databinding.FragmentTaskAddeditBinding
import per.matt.learn.todo.databinding.FragmentTaskBinding

private lateinit var binding: FragmentTaskAddeditBinding;
class TaskAddEditFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentTaskAddeditBinding.inflate(inflater,container,false)

        return binding.root
    }
}