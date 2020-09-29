package com.example.contestwatcher;
import android.content.Context;
import android.icu.text.SimpleDateFormat;
import android.icu.util.TimeZone;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class ContestAdapter extends RecyclerView.Adapter<ContestAdapter.ContestViewHolder>{
    private ArrayList<Contest>contests;
    public ContestAdapter(ArrayList<Contest> contests){
        this.contests=contests;
    }

    public void setContests(ArrayList<Contest> contests) {
        this.contests = contests;
    }

    @Override
    public ContestViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater li = (LayoutInflater) parent.getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View itemView = li.inflate(R.layout.contest_item_view, parent, false);

        return new ContestViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ContestViewHolder holder,int position){
        Contest contest=contests.get(position);
        holder.tv_contestName.setText(contest.getName());
        holder.tv_contestURL.setText(contest.getWebsiteUrl());
        holder.tv_contestPhase.setText("Phase: "+contest.getPhase());  //<--enum getter
        long unix_seconds = contest.getStartTimeSeconds();
        Date date = new Date(unix_seconds * 1000L);
        SimpleDateFormat sdf = new SimpleDateFormat("d MMM,yyyy h:mm a, EEEE", Locale.ENGLISH);
        sdf.setTimeZone(TimeZone.getTimeZone("IST"));
        String formattedDate = sdf.format(date);

        holder.tv_contestStartTime.setText("StartAt: "+formattedDate);//UNIX to IST with Date
        holder.tv_contestDuration.setText("Duration: "+String.valueOf((int)contest.getDurationSeconds()/3600)+"."+String.valueOf(contest.getDurationSeconds()/60-(int)60*(contest.getDurationSeconds()/3600)) +"Hrs");
        holder.tv_contestType.setText("Type: "+contest.getType()); /// <--enum getter
//        holder.tv_contestDifficulty.setText("Difficulty: "+String.valueOf(contest.getDifficulty()));
    }
    @Override
    public int getItemCount(){
        return contests.size();

    }
    class ContestViewHolder extends RecyclerView.ViewHolder{
        TextView tv_contestName,tv_contestURL,tv_contestPhase,tv_contestStartTime;
        TextView tv_contestDuration,tv_contestType,tv_contestDifficulty;
        public ContestViewHolder(View itemView){
            super(itemView);
            tv_contestName=itemView.findViewById(R.id.tv_contestName);
            tv_contestURL=itemView.findViewById(R.id.tv_contestURL);
            tv_contestPhase=itemView.findViewById(R.id.tv_contestPhase);
            tv_contestStartTime=itemView.findViewById(R.id.tv_contestStartTime);
            tv_contestDuration=itemView.findViewById(R.id.tv_contestDuration);
            tv_contestType=itemView.findViewById(R.id.tv_contestType);
//            tv_contestDifficulty=itemView.findViewById(R.id.tv_contestDifficulty);
        }
    }

}