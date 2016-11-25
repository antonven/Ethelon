//package myapps.wycoco.com.ethelon.adapters;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import java.util.List;
//
//import myapps.wycoco.com.ethelon.R;
//import myapps.wycoco.com.ethelon.models.UserProfileModel;
//import myapps.wycoco.com.ethelon.models.profiles;
//
///**
// * Created by dell on 11/26/2016.
// */
//
//public class ProfilesAdapter {
//
//    private Context mContext;
//    private int mResource;
//    private List<UserProfileModel> mProfiles;
//
//    public ProfilesAdapter(Context context, int resource, List<UserProfileModel> profiles) {
//        super(context, resource, profiles);
//
//        mContext = context;
//        mResource = resource;
//        mProfiles = profiles;
//    }
//
//
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        ProfilesAdapter.ViewHolder holder;
//
//        if (convertView == null) {
//            convertView = LayoutInflater.from(mContext).inflate(mResource, parent, false);
//            holder = new ProfilesAdapter.ViewHolder(convertView);
//            convertView.setTag(holder);
//        } else {
//            holder = (ProfilesAdapter.ViewHolder) convertView.getTag();
//        }
//
//        UserProfileModel profiles = mProfiles.get(position);
//        if (profiles != null) {
//            if (holder.volunteerName != null) {
//                holder.volunteerName.setText(profiles.getProfName());
//            }
//            if (holder.volunteerPoints != null) {
//                holder.volunteerPoints.setText(profiles.getProfEmail());
//            }
//            if (holder.volunteerImg != null) {
//                holder.volunteerImg.setImageResource(profiles.getProfImage());
//            }
//
//        }
//
//        return convertView;
//    }
//
//    private static class ViewHolder{
//        TextView volunteerName;
//        TextView volunteerPoints;
//        ImageView volunteerImg;
//        ImageView volunteerBadges;
//        ImageView volunteerRank;
//
//        public ViewHolder(View view){
//            volunteerName = (TextView)view.findViewById(R.id.nameTxt);
//            volunteerPoints = (TextView)view.findViewById(R.id.pointsTxt);
//            volunteerImg = (ImageView)view.findViewById(R.id.volunteerImage);
//            volunteerRank = (ImageView)view.findViewById(R.id.volunteerRank);
//        }
//
//    }
//}
