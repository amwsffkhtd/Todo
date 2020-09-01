package per.matt.learn.todo.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_test.*
import per.matt.learn.todo.R

class TestFragment : Fragment() {


    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_test, container, false)

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_viewmodel.setOnClickListener{
            val action = TestFragmentDirections.actionNavTestToNavTestViewmodel()
            findNavController().navigate(action)
        }
        btn_databinding.setOnClickListener{
            val action = TestFragmentDirections.actionNavTestToNavTestDatabinding();
            findNavController().navigate(action)
        }
    }
}
