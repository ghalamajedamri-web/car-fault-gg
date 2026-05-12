import java.util.ArrayList;

import javax.naming.Context;
import javax.swing.text.View;

public public class CarPartsAdapter extends ArrayAdapter<CarPart> {

    private Context context;
    private ArrayList<CarPart> partsList;

    public CarPartsAdapter(Context context, ArrayList<CarPart> partsList) {
        super(context, R.layout.car_part_row, partsList);
        this.context = context;
        this.partsList = partsList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View row = convertView;

        if (row == null) {
            row = LayoutInflater.from(context)
                    .inflate(R.layout.car_part_row, parent, false);
        }

        CarPart part = partsList.get(position);

        TextView name = row.findViewById(R.id.tvPartName);
        TextView desc = row.findViewById(R.id.tvDescription);
        TextView issues = row.findViewById(R.id.tvCommonIssues);

        name.setText(part.getName());
        desc.setText(part.getDescription());
        issues.setText("Issues: " + part.getCommonIssues());

        row.setOnClickListener(v -> {
            Intent intent = new Intent(context, CarPartDetailsActivity.class);
            intent.putExtra("part_id", part.getId());
            context.startActivity(intent);
        });

        return row;
    }
} {
    
}
