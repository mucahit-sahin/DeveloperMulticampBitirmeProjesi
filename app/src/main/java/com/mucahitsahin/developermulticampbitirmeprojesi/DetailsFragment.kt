package com.mucahitsahin.developermulticampbitirmeprojesi

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import coil.load
import kotlinx.android.synthetic.main.fragment_details.*


class DetailsFragment : Fragment() {

    private val args by navArgs<DetailsFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bannerImageView.load(args.Community.banner)
        descriptionTextView.text=args.Community.description
        leaderImageView.load(args.Community.leader?.photo)
        leaderNameTextView.text=args.Community.leader?.name

        instagramButton.setOnClickListener {
            val myIntent = Intent(Intent.ACTION_VIEW, Uri.parse(args.Community.link?.instagram));
            startActivity(myIntent);
        }
        twitterButton.setOnClickListener {
            val myIntent = Intent(Intent.ACTION_VIEW, Uri.parse(args.Community.link?.twitter));
            startActivity(myIntent);
        }
        youtubeButton.setOnClickListener {
            val myIntent = Intent(Intent.ACTION_VIEW, Uri.parse(args.Community.link?.youtube));
            startActivity(myIntent);
        }
        participationButton.setOnClickListener {
            val myIntent = Intent(Intent.ACTION_VIEW, Uri.parse(args.Community.link?.participation));
            startActivity(myIntent);
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_details, container, false)
    }
}