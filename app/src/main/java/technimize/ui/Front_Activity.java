package technimize.ui;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by rishi on 5/23/2018.
 */

public class Front_Activity extends AppCompatActivity implements View.OnClickListener {

    CardView VisitingCradCV, AadharCardCV, DocumentsCV, PdfToTextCV, StayTunedCV;
    Dialog popoupdialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.AppTheme);

        setContentView(R.layout.front_layout);

        popoupdialog = new Dialog(this);

        VisitingCradCV = (CardView) findViewById(R.id.VisitingCardId);
        AadharCardCV = (CardView) findViewById(R.id.AadharCardId);
        DocumentsCV = (CardView) findViewById(R.id.DocumentsId);
        PdfToTextCV = (CardView) findViewById(R.id.PdfToTextId);
        StayTunedCV = (CardView) findViewById(R.id.StayTunedId);

        VisitingCradCV.setOnClickListener(this);
        AadharCardCV.setOnClickListener(this);
        DocumentsCV.setOnClickListener(this);
        PdfToTextCV.setOnClickListener(this);
        StayTunedCV.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.VisitingCardId:
                showpopupvc();
                break;
            case R.id.AadharCardId:
                showpopupac();
                break;
            case R.id.DocumentsId:
                showpopupdoc();
                break;
            case R.id.PdfToTextId:
                showpopuppdftotext();
                break;
            case R.id.StayTunedId:
                showpopupstaytuned();
                break;

        }

    }

    public void showpopupvc()
    {
        TextView close;
        Button scanbutton;
        Button viewbuttone;

        popoupdialog.setContentView(R.layout.popupvisitingcard);

        close=(TextView) popoupdialog.findViewById(R.id.textviewcloseid);
        viewbuttone= (Button) popoupdialog.findViewById(R.id.popupviewbuttonid);
        scanbutton= (Button) popoupdialog.findViewById(R.id.popupscanbuttonid);

        viewbuttone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent intent=new Intent(Front_Activity.this,SavedVisitingCards.class);
              startActivity(intent);
              popoupdialog.dismiss();
            }
        });

        scanbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Visiting Card scan here", Toast.LENGTH_SHORT).show();
                popoupdialog.dismiss();
            }
        });
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popoupdialog.dismiss();
            }
        });
        popoupdialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        popoupdialog.show();
    }

    public void showpopupac()
    {
        TextView close;
        Button scanbutton;
        Button viewbuttone;

        popoupdialog.setContentView(R.layout.popupaadharcard);

        close=(TextView) popoupdialog.findViewById(R.id.textviewcloseid);
        viewbuttone= (Button) popoupdialog.findViewById(R.id.popupviewbuttonid);
        scanbutton= (Button) popoupdialog.findViewById(R.id.popupscanbuttonid);

        viewbuttone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Aadhar Card view here", Toast.LENGTH_SHORT).show();
                popoupdialog.dismiss();
            }
        });

        scanbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Aadhar Card scan here", Toast.LENGTH_SHORT).show();
                popoupdialog.dismiss();
            }
        });
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popoupdialog.dismiss();
            }
        });
        popoupdialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        popoupdialog.show();
    }

    public void showpopupdoc()
    {
        TextView close;
        Button scanbutton;
        Button viewbuttone;

        popoupdialog.setContentView(R.layout.popupdocuments);

        close=(TextView) popoupdialog.findViewById(R.id.textviewcloseid);
        viewbuttone= (Button) popoupdialog.findViewById(R.id.popupviewbuttonid);
        scanbutton= (Button) popoupdialog.findViewById(R.id.popupscanbuttonid);

        viewbuttone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Document view here", Toast.LENGTH_SHORT).show();
                popoupdialog.dismiss();
            }
        });

        scanbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Document scan here", Toast.LENGTH_SHORT).show();
                popoupdialog.dismiss();
            }
        });
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popoupdialog.dismiss();
            }
        });
        popoupdialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        popoupdialog.show();
    }


    public void showpopuppdftotext()
    {
        TextView close;
        Button scanbutton;
        Button viewbuttone;

        popoupdialog.setContentView(R.layout.popuppdftotext);

        close=(TextView) popoupdialog.findViewById(R.id.textviewcloseid);
        viewbuttone= (Button) popoupdialog.findViewById(R.id.popupviewbuttonid);
        scanbutton= (Button) popoupdialog.findViewById(R.id.popupscanbuttonid);

        viewbuttone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Pdf to text view here", Toast.LENGTH_SHORT).show();
                popoupdialog.dismiss();
            }
        });

        scanbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Pdf to text scan here", Toast.LENGTH_SHORT).show();
                popoupdialog.dismiss();
            }
        });
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popoupdialog.dismiss();
            }
        });
        popoupdialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        popoupdialog.show();
    }

    public void showpopupstaytuned()
    {
        TextView close;
        Button scanbutton;


        popoupdialog.setContentView(R.layout.popupstaytuned);

        close=(TextView) popoupdialog.findViewById(R.id.textviewcloseid);

        scanbutton= (Button) popoupdialog.findViewById(R.id.popupscanbuttonid);

        scanbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Website link here", Toast.LENGTH_SHORT).show();
                popoupdialog.dismiss();
            }
        });
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popoupdialog.dismiss();
            }
        });
        popoupdialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        popoupdialog.show();
    }

}
