package com.badzohugues.splitztemplateapp.ui.repos

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.badzohugues.splitztemplateapp.data.domain.model.Repo

class UserReposAdapter(private var itemRepoClick: ((item: Repo) -> Unit) = { }) :
    RecyclerView.Adapter<UserReposAdapter.UserRepoViewHolder>() {
    var repos: List<Repo> = ArrayList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserRepoViewHolder {
        return UserRepoViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: UserRepoViewHolder, position: Int) {
        val repo = repos[position]

        holder.bind(repo)
        holder.itemView.setOnClickListener { itemRepoClick.invoke(repo) }
    }

    override fun getItemCount(): Int = repos.size

    class UserRepoViewHolder(private val binding: ItemAlbumBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val thumbnailImv = binding.imvThumbnail
        fun bind(repoData: Repo) {
            binding.albumItemData = itemData
            binding.executePendingBindings()
        }

        companion object {
            fun from(parent: ViewGroup): UserRepoViewHolder {
                return UserRepoViewHolder(
                    ItemAlbumBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                )
            }
        }
    }
}
