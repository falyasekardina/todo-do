package id.ac.ui.cs.mobileprogramming.naufaldi_athallah_rifqi.todo_do.utils.helper

import android.content.Context
import android.widget.Toast

class Toaster(val context: Context) {
    // Show all toasts from one place
    fun showToast(message: String){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}