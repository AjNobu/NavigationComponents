package com.example.firstapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
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
        navCon = NavController(requireContext())
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val name = binding.inputLayout1.editText?.text.toString()
        val email = binding.inputLayout2.editText?.text.toString()
        val anime = binding.inputLayout3.editText?.text.toString()
        val action =
            HomeFragmentDirections.actionHomeFragmentToSubmissionFragment(name, email, anime)
        binding.submit.setOnClickListener {
            navCon.navigate(action)
        }
    }

}