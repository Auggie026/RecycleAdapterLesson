package Controller

import Adapters.CategoryAdapter
import Adapters.CategoryRecycleAdapter
import Model.Category
import Services.DataService
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.coderswag.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryRecycleAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataService.categories)

        categoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)

//        categoryListView.setOnItemClickListener{adapterView, view, i, l ->
//            val category = DataService.categories[i]
//            Toast.makeText(this, "You clicke on the ${category.tittle} cell", Toast.LENGTH_SHORT).show()
//        }

    }
}

