package com.example.firstapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import com.example.firstapplication.databinding.FragmentSubmissionBinding


class SubmissionFragment : Fragment() {
    private var _binding: FragmentSubmissionBinding? = null
    private val binding get() = _binding!!
    private lateinit var name: String
    private lateinit var email: String
    private lateinit var anime: String

    companion object{
        const val NAME = "name"
        const val EMAIL = "email"
        const val ANIME = "anime"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            name = it.getString(NAME).toString()
            email = it.getString(EMAIL).toString()
            anime = it.getString("anime").toString()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSubmissionBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.nameText.text = name
        binding.emailText.text = email
        binding.animeText.text = anime
    }

}