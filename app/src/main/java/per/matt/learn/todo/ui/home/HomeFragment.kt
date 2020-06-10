package per.matt.learn.todo.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.fragment_home.view.*
import per.matt.learn.todo.R

class HomeFragment : Fragment() {

//    private lateinit var homeViewModel: HomeViewModel

    private var homeViewModel: HomeViewModel = HomeViewModel()

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
//        homeViewModel =
//                ViewModelProviders.of(this).get(HomeViewModel::class.java)

        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })

        homeViewModel.testText.observe(viewLifecycleOwner, Observer {
            root.tv_test.text= it
        })
        root.btn_test.setOnClickListener(View.OnClickListener {
            homeViewModel.testText.value = "Hello"
        })

        return root
    }
}
