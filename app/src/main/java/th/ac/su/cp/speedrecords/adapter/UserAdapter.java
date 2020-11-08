//package th.ac.su.cp.speedrecords.adapter;
//import android.content.Context;
//import android.graphics.Color;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import th.ac.su.cp.speedrecords.R;
//import th.ac.su.cp.speedrecords.model.*;
////import com.example.mycontacts.util.DateFormatter;
//
//import th.ac.su.cp.speedrecords.R;
//
//public class UserAdapter extends RecyclerView.Adapter<UserAdapter.MyViewHolder> {
//
//    private Context mContext;
//    private User[] mUsers;
//
//    public UserAdapter(Context context, User[] users) {
//        this.mContext = context;
//        this.mUsers = users;
//    }
//
//    @NonNull
//    @Override
//    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View v = LayoutInflater.from(parent.getContext())
//                .inflate(R.layout.item_user, parent, false);
//        return new MyViewHolder(v);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
//        User user = mUsers[position];
//
//        holder.totalTextView.setText(user.Total);
//
//        holder.checkImageView.setImageResource(
//                user.check == User.Check_limit ? R.drawable.red_cow : R.drawable.red_cow
//        );
//    }
//
//    @Override
//    public int getItemCount() {
//        return mUsers.length;
//    }
//
//    static class MyViewHolder extends RecyclerView.ViewHolder {
//        TextView totalTextView;
//        TextView TextView3;
//        ImageView checkImageView;
//
//
//        public MyViewHolder(@NonNull View itemView) {
//            super(itemView);
//
//            this.totalTextView = itemView.findViewById(R.id.textView2);
//            this.TextView3 = itemView.findViewById(R.id.textView3);
//            this.checkImageView = itemView.findViewById(R.id.status_image_view);
//
//        }
//    }
//}
//
