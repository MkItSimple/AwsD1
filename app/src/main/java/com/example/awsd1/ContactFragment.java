package com.example.awsd1;


import android.nfc.Tag;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ContactFragment extends Fragment {


    private static final String TAG = "ContactFragment";
    View v;
    private RecyclerView myrecyclerview;
    private List<Contact>  lstContact;

    public ContactFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_contact, container, false);
        myrecyclerview = v.findViewById(R.id.contact_recyclerview);
        RecyclerViewwAdapter recyclerViewwAdapter = new RecyclerViewwAdapter(getContext(), lstContact);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getContext()));
        myrecyclerview.setAdapter(recyclerViewwAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstContact = new ArrayList<>();
        lstContact.add(new Contact("Aaron Jones", "(111) 241233453", R.drawable.pi1r));
        lstContact.add(new Contact("Amelia Kendrich", "(111) 241233453", R.drawable.pi2r));
        lstContact.add(new Contact("Mark Jhones", "(111) 241233453", R.drawable.pi3r));
        lstContact.add(new Contact("Joseph Magbanua", "(111) 241233453", R.drawable.pi1r));
        lstContact.add(new Contact("Jason Silaran", "(111) 241233453", R.drawable.pi2r));
        lstContact.add(new Contact("Reymil Anania", "(111) 241233453", R.drawable.pi3r));
        lstContact.add(new Contact("Aaron Jones", "(111) 241233453", R.drawable.pi1r));
        lstContact.add(new Contact("Amelia Kendrich", "(111) 241233453", R.drawable.pi2r));
        lstContact.add(new Contact("Mark Jhones", "(111) 241233453", R.drawable.pi3r));
        lstContact.add(new Contact("Joseph Magbanua", "(111) 241233453", R.drawable.pi1r));
        lstContact.add(new Contact("Jason Silaran", "(111) 241233453", R.drawable.pi2r));
        lstContact.add(new Contact("Reymil Anania", "(111) 241233453", R.drawable.pi3r));

//        Log.d(TAG, "onCreate: " + lstContact);

    }

}
