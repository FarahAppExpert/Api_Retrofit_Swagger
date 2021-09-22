package com.example.api_practice.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.api_practice.R
import com.example.api_practice.model.model
import com.example.api_practice.utilities.item_clickListener


class adapter (list : List<model>, rawLayout : Int, context: Context) : RecyclerView.Adapter<adapter.ViewHolder>() {
    private  var list: List<model>
    private var rowLayout: Int = 0
    private var context: Context

    init {
        this.list = list
        this.rowLayout = rowLayout
        this.context = context

    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): adapter.ViewHolder {
        var view: View = LayoutInflater.from(viewGroup.getContext()).inflate(rowLayout, viewGroup, false)
        return ViewHolder(view)
    }


    @SuppressLint("RecyclerView")
    override fun onBindViewHolder(holder: adapter.ViewHolder, position: Int) {
        val model_varable: model = list.get(position)
        holder.name.setText(model_varable.getoriginal_title());
        Glide.with(context)
            .load(model_varable.getid()).load(model_varable.getoriginal_language())
            .into(holder.image);
        holder.setClickListener(object : item_clickListener {

            override fun onClick(view: View, overview: Int, isLongClick: Boolean) {
                if (isLongClick) {
                    Toast.makeText(
                        context,
                        "#" + position + " - " + model_varable.getoriginal_language() + " (Long click)",
                        Toast.LENGTH_SHORT
                    ).show();
                } else {
                    Toast.makeText(
                        context,
                        "#" + position + " - " + model_varable.getoriginal_title(),
                        Toast.LENGTH_SHORT
                    ).show();
                }
            }

        });

    }

    override fun getItemCount(): Int {
        return list.size
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener, View.OnLongClickListener {
        public lateinit var name: TextView;
        public lateinit var image: ImageView;

        public lateinit var versionName: String
        private lateinit var clickListener: item_clickListener
        fun ViewHolder(itemView: View) {
            name = itemView.findViewById(R.id.name) as TextView
            image = itemView.findViewById(R.id.img) as ImageView

            itemView.setTag(itemView);
            itemView.setOnClickListener(this);
            itemView.setOnLongClickListener(this);

        }

        public fun setClickListener(itemClickListener: item_clickListener) {
            this.clickListener = itemClickListener;
        }


        override fun onClick(view: View) {
            clickListener.onClick(view, getPosition(), false);
        }


        override fun onLongClick(view: View?): Boolean {
            clickListener.onClick(view!!, getPosition(), true);
            return true;
        }


    }
}