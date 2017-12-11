package net.simplifiedcoding.kotlinrecyclerviewexample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        val users = ArrayList<User>()


        users.add(User("Oz Coffee Waffle Recipe", "Oz Coffee Waffle Recipe"))
        users.add(User("Ragi Samosa filled with Cucumber, Peas and Cashew nut Recipe","The lighter version of the traditional oil laden samosas. Get your Samosa cravings fulfilled without compromising on your health. This healthy, tea-time snack is perfect for your next party."))
        users.add(User("Paneer Toasty With Salsa", "Cottage cheese mixture stuffed between bread and toasted. Served with a tangy salsa Recipe."))
        users.add(User("Pan Cakes", "n easy, no-fuss recipe that is filling, comforting, and does not skimp on flavor one bit. I was actually very surprised by how fluffy these pancakes turned out to be, considering I did not use any baking soda."))
        val adapter = CustomAdapter(users,applicationContext)


        recyclerView.adapter = adapter
    }
}
