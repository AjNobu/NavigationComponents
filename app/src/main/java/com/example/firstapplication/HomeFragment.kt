package com.example.firstapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.firstapplication.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private lateinit var navCon: NavController


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        navCon = NavHostFragment.findNavController(this)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        val name = binding.inputLayout1.editText?.text.toString()
        binding.submit.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("name", binding.inputLayout1.editText?.text.toString())
            bundle.putString("email", binding.inputLayout2.editText?.text.toString())
            bundle.putString("anime", binding.inputLayout3.editText?.text.toString())
            navCon.navigate(R.id.action_homeFragment_to_submissionFragment)
        }
    }

}