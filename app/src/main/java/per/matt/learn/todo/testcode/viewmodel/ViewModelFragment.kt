package per.matt.learn.todo.testcode.viewmodel

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import kotlinx.android.synthetic.main.fragment_viewmodel.*
import per.matt.learn.todo.databinding.FragmentViewmodelBinding
import per.matt.learn.todo.testcode.bean.User


private lateinit var binding: FragmentViewmodelBinding



class ViewModelFragment : Fragment() {

    /**
     * by viewModels() -> bind the viewmodel scope to this fragment,
     * then onCleared() will be called when the fragment destroy.
     */
    private val viewModel: TestViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentViewmodelBinding.inflate(inflater,container,false)
        binding.lifecycleOwner = this.viewLifecycleOwner

        binding.viewmodel = viewModel

        return binding.root;
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_user.setOnClickListener {
            viewModel.setUser("Jacky","Chen")
            // the user changed, but the text of tv_user didn't change
            Toast.makeText(view.context,"first name changed to:"+viewModel.getUser().firstName, Toast.LENGTH_SHORT).show()
        }

        btn_observable_user.setOnClickListener {
            viewModel.setObservableUser("Jacky","Chen",30)
            // the user changed, but the text of tv_user didn't change
            Toast.makeText(view.context,"first name changed to:"+viewModel.getObservableUser().firstName.get(), Toast.LENGTH_SHORT).show()
        }

        btn_livedata_user.setOnClickListener {
            viewModel.setLiveDataUser("Saul","Chen",30)
            // the user changed, but the text of tv_user didn't change
            Toast.makeText(view.context,"first name changed to:"+viewModel.getLiveDataUser().firstName.value, Toast.LENGTH_SHORT).show()
        }
    }


    override fun onDestroy() {
        super.onDestroy()
        Log.d("vlog","onDestroy")
    }

    override fun onResume() {
        super.onResume()
        Log.d("vlog","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("vlog","onPause")
    }

}