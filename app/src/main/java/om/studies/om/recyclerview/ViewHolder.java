package om.studies.om.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class ViewHolder extends RecyclerView.ViewHolder {
    private TextView name;

    public ViewHolder(View item) {
        super(item);
        name = (TextView) item.findViewById(R.id.textView);
    }
}
