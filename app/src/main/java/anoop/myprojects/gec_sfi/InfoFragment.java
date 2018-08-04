package anoop.myprojects.gec_sfi;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class InfoFragment extends Fragment {


    public InfoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_info, container, false);

        TextView fb =view.findViewById(R.id.fblink);
        TextView fb1 =view.findViewById(R.id.fblink1);
        TextView fb2 =view.findViewById(R.id.fblink2);




        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                goToUrl("https://www.facebook.com/sfigecskp/");

            }
        });

        return view;
    }

    private void goToUrl(String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

}
