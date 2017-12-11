package net.simplifiedcoding.kotlinrecyclerviewexample

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by Belal on 6/23/2017.
 */
class CustomAdapter(val userList: ArrayList<User>,context: Context) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

var mContext = context

    override fun onBindViewHolder(p0: ViewHolder?, p1: Int) {
        val user: User = userList[p1]
        p0?.textViewName?.text = user.name
        p0?.textViewAddress?.text = user.address

        p0?.setOncustomItemClickListener(object :CustomItemClickListener{
            override fun onCustomClickListener(view: View, pos: Int) {

                if (user.name == "Oz Coffee Waffle Recipe") {

                    val activityIntent = Intent(mContext, CoffeeWaff::class.java)
                    activityIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                    mContext.startActivity(activityIntent)
                }
                else if (user.name == "Ragi Samosa filled with Cucumber, Peas and Cashew nut Recipe"){


                    val activityIntent2 = Intent(mContext, RagiSamosa::class.java)
                    activityIntent2.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                    mContext.startActivity(activityIntent2)
                }
                else if (user.name == "Paneer Toasty With Salsa"){
                    val activityIntent2 = Intent(mContext, PaneerToasty::class.java)
                    activityIntent2.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                    mContext.startActivity(activityIntent2)
                }
                else if (user.name == "Pan Cakes"){
                    val activityIntent2 = Intent(mContext, PanCakes::class.java)
                    activityIntent2.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                    mContext.startActivity(activityIntent2)
                }



            }

        })

    }

    override fun onCreateViewHolder(p0: ViewGroup?, p1: Int): ViewHolder {
        val v = LayoutInflater.from(p0?.context).inflate(R.layout.list_layout, p0, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {

        return userList.size
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),View.OnClickListener {

            var textViewName:TextView
        var textViewAddress:TextView


        var customClickListener:CustomItemClickListener?=null
init {
    textViewName = itemView.findViewById(R.id.textViewName) as TextView
    textViewAddress = itemView.findViewById(R.id.textViewAddress) as TextView
itemView.setOnClickListener(this)

}



        fun setOncustomItemClickListener(itemClicklistener: CustomItemClickListener) {

            this.customClickListener = itemClicklistener
        }
        override fun onClick(p0: View?) {
            this.customClickListener!!.onCustomClickListener(p0!!,adapterPosition)
        }


    }
}