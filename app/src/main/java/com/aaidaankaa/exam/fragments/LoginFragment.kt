package com.aaidaankaa.exam.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.aaidaankaa.exam.MainActivity
import com.aaidaankaa.exam.databinding.FragmentLoginBinding
import com.aaidaankaa.exam.storage.SharedPreference

class LoginFragment : Fragment() {
    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val sharedPreference = SharedPreference(requireActivity())

        binding.saveUserBtn.setOnClickListener {
            sharedPreference.login = binding.loginEt.text.toString()
            sharedPreference.password = binding.passwordEt.text.toString()

            startActivity(Intent(requireActivity(), MainActivity::class.java))
        }
    }
}