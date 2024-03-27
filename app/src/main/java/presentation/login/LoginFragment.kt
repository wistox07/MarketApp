package presentation.login

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.wistox07.marketapp.R
import com.wistox07.marketapp.databinding.FragmentSplashBinding

private val SPLASH_TIME_OUT : Long = 4000
private lateinit var binding : FragmentSplashBinding
class LoginFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }
    /*
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Handler(Looper.getMainLooper()).postDelayed({
                Navigation.findNavController(view).navigate(R.id.action_splashFragment_to_loginFragment3)
        }, SPLASH_TIME_OUT)
    }
    */

}