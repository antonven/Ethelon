package myapps.wycoco.com.ethelon.adapters;

import android.content.Context;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

import myapps.wycoco.com.ethelon.R;
import myapps.wycoco.com.ethelon.models.Volunteers;

public class VolunteersAdapter extends ArrayAdapter<Volunteers> {

    private Context mContext;
    private int mResource;
    private List<Volunteers> mVolunteers;
    public VolunteersAdapter(Context context, int resource, List<Volunteers> volunteers) {
        super(context, resource, volunteers);

        mContext = context;
        mResource = resource;
        mVolunteers = volunteers;
    }



        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder holder;

            if (convertView == null) {
                convertView = LayoutInflater.from(mContext).inflate(mResource, parent, false);
                holder = new ViewHolder(convertView);
                convertView.setTag(holder);
            } else {
                holder = (ViewHolder) convertView.getTag();
            }

            Volunteers volunteers = mVolunteers.get(position);
            if (volunteers != null) {
                if (holder.volunteerName != null) {
                    holder.volunteerName.setText(volunteers.getName());
                }
                if (holder.volunteerPoints != null) {
                    holder.volunteerPoints.setText(volunteers.getPoints());
                }
                if (holder.volunteerImg != null) {
                    holder.volunteerImg.setImageResource(volunteers.getVolunteerImage());
                }
                if (holder.volunteerBadges != null) {
                    holder.volunteerBadges.setImageResource(volunteers.getBadgeImage());
                }
                if (holder.volunteerRank != null) {
                    holder.volunteerRank.setImageResource(volunteers.getRankingImage());
                }
            }

            return convertView;
        }

    static class ViewHolder{
        TextView volunteerName;
        TextView volunteerPoints;
        ImageView volunteerImg;
        ImageView volunteerBadges;
        ImageView volunteerRank;

            public ViewHolder(View view){
                volunteerName = (TextView)view.findViewById(R.id.nameTxt);
                volunteerPoints = (TextView)view.findViewById(R.id.pointsTxt);
                volunteerImg = (ImageView)view.findViewById(R.id.volunteerImage);
                volunteerRank = (ImageView)view.findViewById(R.id.volunteerRank);
            }

    }


}
