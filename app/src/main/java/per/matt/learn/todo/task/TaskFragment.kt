package per.matt.learn.todo.task

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_task.*
import per.matt.learn.todo.databinding.FragmentTaskBinding


class TaskFragment : Fragment() {
    private lateinit var binding: FragmentTaskBinding;
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentTaskBinding.inflate(inflater,container,false)


        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_test.setOnClickListener{
            val action = TaskFragmentDirections.actionNavTaskToNavTaskAddEdit()
            findNavController().navigate(action)
        }
    }
}