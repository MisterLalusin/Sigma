package pro.gr.ams.sigma;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class AppActivity extends AppCompatActivity {

    private String activeLayout = "lyt_login";
    private LinearLayout login_Activity;
    private TextView login_accountDTXTVW;
    private TextView login_passwordDTXTVW;
    private Button login_logIn;
    private Button login_registerBTTN;
    Date date = new Date();

    private int userCount = 2;
    private int activeUser = -1;

    //data


    //Users
    private String fNameU1 = "John Rovic", mNameU1 = "Dusdus", lNameU1 = "Lalusin", emailU1 = "misterlalusin@gmail.com", passU1 = "12345678", balU1 = "50";
    private String fNameU2 = "Mae Paulene", mNameU2 = "Igtanloc", lNameU2 = "Ilagan", emailU2 = "imaepaulene@gmail.com", passU2 = "012345678", balU2 = "50";
    private String fNameU3 = "", mNameU3 = "", lNameU3 = "", emailU3 = "", passU3 = "", balU3 = "50";
    private String fNameU4 = "", mNameU4 = "", lNameU4 = "", emailU4 = "", passU4 = "", balU4 = "50";
    private String fNameU5 = "", mNameU5 = "", lNameU5 = "", emailU5 = "", passU5 = "", balU5 = "50";

    //NotificationsUser1
    private int u1NotifCount = 1;
    private String u1Notif1ID = "1", u1Notif1Contnent = "Welcome to Zigma Mobile Banking ", u1Notif1Date = "Tue Feb 11 17:03:56\nGMT+08:00 2020";
    private String u1Notif2ID = "2", u1Notif2Contnent = "", u1Notif2Date = "";
    private String u1Notif3ID = "3", u1Notif3Contnent = "", u1Notif3Date = "";
    private String u1Notif4ID = "4", u1Notif4Contnent = "", u1Notif4Date = "";
    private String u1Notif5ID = "5", u1Notif5Contnent = "", u1Notif5Date = "";

    //NotificationsUser2
    private int u2NotifCount = 1;
    private String u2Notif1ID = "1", u2Notif1Contnent = "Welcome to Zigma Mobile Banking ", u2Notif1Date = "Tue Feb 11 17:03:56\nGMT+08:00 2020";
    private String u2Notif2ID = "2", u2Notif2Contnent = "", u2Notif2Date = "";
    private String u2Notif3ID = "3", u2Notif3Contnent = "", u2Notif3Date = "";
    private String u2Notif4ID = "4", u2Notif4Contnent = "", u2Notif4Date = "";
    private String u2Notif5ID = "5", u2Notif5Contnent = "", u2Notif5Date = "";

    //NotificationsUser3
    private int u3NotifCount = 1;
    private String u3Notif1ID = "1", u3Notif1Contnent = "Welcome to Zigma Mobile Banking ", u3Notif1Date = "";
    private String u3Notif2ID = "2", u3Notif2Contnent = "", u3Notif2Date = "";
    private String u3Notif3ID = "3", u3Notif3Contnent = "", u3Notif3Date = "";
    private String u3Notif4ID = "4", u3Notif4Contnent = "", u3Notif4Date = "";
    private String u3Notif5ID = "5", u3Notif5Contnent = "", u3Notif5Date = "";

    //NotificationsUser4
    private int u4NotifCount = 1;
    private String u4Notif1ID = "1", u4Notif1Contnent = "Welcome to Zigma Mobile Banking ", u4Notif1Date = "";
    private String u4Notif2ID = "2", u4Notif2Contnent = "", u4Notif2Date = "";
    private String u4Notif3ID = "3", u4Notif3Contnent = "", u4Notif3Date = "";
    private String u4Notif4ID = "4", u4Notif4Contnent = "", u4Notif4Date = "";
    private String u4Notif5ID = "5", u4Notif5Contnent = "", u4Notif5Date = "";

    //NotificationsUser5
    private int u5NotifCount = 1;
    private String u5Notif1ID = "1", u5Notif1Contnent = "Welcome to Zigma Mobile Banking ", u5Notif1Date = "";
    private String u5Notif2ID = "2", u5Notif2Contnent = "", u5Notif2Date = "";
    private String u5Notif3ID = "3", u5Notif3Contnent = "", u5Notif3Date = "";
    private String u5Notif4ID = "4", u5Notif4Contnent = "", u5Notif4Date = "";
    private String u5Notif5ID = "5", u5Notif5Contnent = "", u5Notif5Date = "";

    //data
    private LinearLayout main_activity;
    private ImageView main_log_outMGVW;
    private TextView main_balanceTXTVW;
    private LinearLayout main_addMoneyLNRLYT;
    private LinearLayout main_sendMoneyLNRLYT;
    private LinearLayout main_widthdrawMoneyLNRLYT;
    private LinearLayout main_notification1LNRLYT;
    private LinearLayout main_notification2LNRLYT;
    private LinearLayout main_notification3LNRLYT;
    private LinearLayout main_notification4LNRLYT;
    private LinearLayout main_notification5LNRLYT;
    private TextView main_notification1TXTVW;
    private TextView main_notification2TXTVW;
    private TextView main_notification3TXTVW;
    private TextView main_notification4TXTVW;
    private TextView main_notification5TXTVW;
    private TextView main_FnameTXTVW;
    private TextView main_LnameTXTVW;
    private LinearLayout register_activityLNRLYT;
    private TextView register_fnameDTXTVW;
    private TextView register_mnameDTXTVW;
    private TextView register_lnameDTXTVW;
    private TextView register_accountDTXTVW;
    private TextView register_passwordDTXTVW;
    private TextView register_confirmPassDTXTVW;
    private Button register_registerBTTN;
    private EditText main_amountDTTXT;
    private int amount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);

        try {
            logInActivity();
        }
        catch (Exception ex) {
            Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        }
    }

    private void logInActivity() {
        setContentView(R.layout.lyt_login);
        activeLayout = "lyt_login";
        activeUser = -1;
        login_Activity = (LinearLayout)findViewById(R.id.login_Activity);
        login_accountDTXTVW = (TextView)findViewById(R.id.login_accountDTXTVW);
        login_passwordDTXTVW = (TextView)findViewById(R.id.login_passwordDTXTVW);
        login_logIn = (Button)findViewById(R.id.login_logIn);
        login_registerBTTN = (Button)findViewById(R.id.login_registerBTTN);

        login_logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String account = login_accountDTXTVW.getText().toString();
                String pass = login_passwordDTXTVW.getText().toString();
                if (account.length()==0 || pass.length()==0) {
                    Toast.makeText(AppActivity.this, "Complete The Required Fields!", Toast.LENGTH_SHORT).show();
                }
                else{
                    if (account.equals(emailU1) && pass.equals(passU1)) {
                        activeUser = 1;
                        logInSuccessful();
                    }
                    else if (account.equals(emailU2) && pass.equals(passU2)) {
                        activeUser = 2;
                        logInSuccessful();
                    }
                    else if (account.equals(emailU3) && pass.equals(passU3)) {
                        activeUser = 3;
                        logInSuccessful();
                    }
                    else if (account.equals(emailU4) && pass.equals(passU4)) {
                        activeUser = 4;
                        logInSuccessful();
                    }
                    else if (account.equals(emailU5) && pass.equals(passU5)) {
                        activeUser = 5;
                        logInSuccessful();
                    }
                    else {
                        Toast.makeText(AppActivity.this, "Log in failed!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        login_registerBTTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerActivity();
            }
        });
    }

    private void registerActivity() {
        activeLayout = "lyt_register";
        setContentView(R.layout.lyt_register);
        register_activityLNRLYT = (LinearLayout)findViewById(R.id.register_activityLNRLYT);
        register_fnameDTXTVW = (TextView)findViewById(R.id.register_fnameDTXTVW);
        register_mnameDTXTVW = (TextView)findViewById(R.id.register_mnameDTXTVW);
        register_lnameDTXTVW = (TextView)findViewById(R.id.register_lnameDTXTVW);
        register_accountDTXTVW = (TextView)findViewById(R.id.register_accountDTXTVW);
        register_passwordDTXTVW = (TextView)findViewById(R.id.register_passwordDTXTVW);
        register_confirmPassDTXTVW = (TextView)findViewById(R.id.register_confirmPassDTXTVW);
        register_registerBTTN = (Button)findViewById(R.id.register_registerBTTN);
        register_registerBTTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fname = register_fnameDTXTVW.getText().toString();
                String mname = register_mnameDTXTVW.getText().toString();
                String lname = register_lnameDTXTVW.getText().toString();
                String email = register_accountDTXTVW.getText().toString();
                String pass = register_passwordDTXTVW.getText().toString();
                String conpass = register_confirmPassDTXTVW.getText().toString();
                if (fname.length() == 0 || mname.length() == 0 || lname.length() == 0 || email.length() == 0 || pass.length() == 0 || conpass.length() == 0) {
                    Toast.makeText(AppActivity.this, "Please complete the fields!", Toast.LENGTH_SHORT).show();
                }
                else if (email.contains("@") == false) {
                    Toast.makeText(AppActivity.this, "Invalid email!", Toast.LENGTH_SHORT).show();
                }
                else if (pass.equals(conpass) == false) {
                    Toast.makeText(AppActivity.this, "Check your password!", Toast.LENGTH_SHORT).show();
                }
                else if (pass.length() < 8) {
                    Toast.makeText(AppActivity.this, "Password must be atleast 8 characters!", Toast.LENGTH_SHORT).show();
                }
                else if (email.equals(emailU1) || email.equals(emailU2) || email.equals(emailU3) || email.equals(emailU4) || email.equals(emailU5)) {
                    Toast.makeText(AppActivity.this, "Email was used already!", Toast.LENGTH_SHORT).show();
                }
                else if (!emailU5.equals("")) {
                    Toast.makeText(AppActivity.this, "Database full!", Toast.LENGTH_SHORT).show();
                }
                else {
                    userCount++;

                    if (userCount == 3) {
                        fNameU3 = fname; mNameU3 = mname; lNameU3 = lname; emailU3 = email; passU3 = pass;
                        u3Notif1Date = date+"";
                    }
                    else if (userCount == 4) {
                        fNameU4 = fname; mNameU4 = mname; lNameU4 = lname; emailU4 = email; passU4 = pass;
                        u4Notif1Date = date+"";
                    }
                    else if (userCount == 5) {
                        fNameU5 = fname; mNameU5 = mname; lNameU5 = lname; emailU5 = email; passU5 = pass;
                        u5Notif1Date = date+"";
                    }
                    Toast.makeText(AppActivity.this, "Registered Successfully", Toast.LENGTH_SHORT).show();
                    logInActivity();
                }
            }
        });
    }

    private void logInSuccessful() {
        mainActivity();
        Toast.makeText(this, "Log in successful!", Toast.LENGTH_SHORT).show();
    }

    private void mainActivity() {
        setContentView(R.layout.lyt_main);
        activeLayout = "lyt_main";
        main_activity = (LinearLayout)findViewById(R.id.main_activity);
        main_log_outMGVW = (ImageView)findViewById(R.id.main_log_outMGVW);
        main_balanceTXTVW = (TextView)findViewById(R.id.main_balanceTXTVW);
        main_addMoneyLNRLYT = (LinearLayout)findViewById(R.id.main_addMoneyLNRLYT);
        main_sendMoneyLNRLYT = (LinearLayout)findViewById(R.id.main_sendMoneyLNRLYT);
        main_widthdrawMoneyLNRLYT = (LinearLayout)findViewById(R.id.main_widthdrawMoneyLNRLYT);
        main_notification1LNRLYT = (LinearLayout)findViewById(R.id.main_notification1LNRLYT);
        main_notification2LNRLYT = (LinearLayout)findViewById(R.id.main_notification2LNRLYT);
        main_notification3LNRLYT = (LinearLayout)findViewById(R.id.main_notification3LNRLYT);
        main_notification4LNRLYT = (LinearLayout)findViewById(R.id.main_notification4LNRLYT);
        main_notification5LNRLYT = (LinearLayout)findViewById(R.id.main_notification5LNRLYT);
        main_notification1TXTVW = (TextView)findViewById(R.id.main_notification1TXTVW);
        main_notification2TXTVW = (TextView)findViewById(R.id.main_notification2TXTVW);
        main_notification3TXTVW = (TextView)findViewById(R.id.main_notification3TXTVW);
        main_notification4TXTVW = (TextView)findViewById(R.id.main_notification4TXTVW);
        main_notification5TXTVW = (TextView)findViewById(R.id.main_notification5TXTVW);
        main_FnameTXTVW = (TextView)findViewById(R.id.main_FnameTXTVW);
        main_LnameTXTVW = (TextView)findViewById(R.id.main_LnameTXTVW);

        main_log_outMGVW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backpressCount=0;
                logInActivity();
            }
        });

        main_addMoneyLNRLYT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amountDialog("addMoney");
            }
        });

        main_sendMoneyLNRLYT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amountDialog("sendMoney");
            }
        });

        main_widthdrawMoneyLNRLYT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amountDialog("widthdraw");
            }
        });

        displayNotifications();
        setUserName();
        setBalance();
    }

    private void amountDialog(final String action) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();

        final View amountDialogView = inflater.inflate(R.layout.dialog_amount, null);
        builder.setView(amountDialogView)
                .setPositiveButton("Continue", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        main_amountDTTXT = (EditText) amountDialogView.findViewById(R.id.main_amountDTTXT);
                        if (main_amountDTTXT.getText().toString().length() != 0) {
                            amount = Integer.parseInt(main_amountDTTXT.getText().toString());


                            if (action.equals("addMoney")) {
                                addMoney();
                            }

                            else if (action.equals("sendMoney")) {
                                sendMoney();
                            }


                            else if (action.equals("widthdraw")) {
                                widthdraw();
                            }
                        }
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //LoginDialogFragment.this.getDialog().cancel();
                    }
                });
        builder.create();
        builder.show();
    }

    private void widthdraw() {
        if (activeUser == 1 && (Integer.parseInt(balU1) >= amount)) {
            balU1 = (Integer.parseInt(balU1) - amount)+"";
            main_balanceTXTVW.setText(balU1);
            createNotif("You widthdraw "+ amount + " pesos.");
        }
        else if (activeUser == 2 && (Integer.parseInt(balU2) >= amount)) {
            balU2 = (Integer.parseInt(balU2) - amount)+"";
            main_balanceTXTVW.setText(balU2);
            createNotif("You widthdraw "+ amount + " pesos.");
        }
        else if (activeUser == 3 && (Integer.parseInt(balU3) >= amount)) {
            balU3 = (Integer.parseInt(balU3) - amount)+"";
            main_balanceTXTVW.setText(balU3);
            createNotif("You widthdraw "+ amount + " pesos.");
        }
        else if (activeUser == 4 && (Integer.parseInt(balU4) >= amount)) {
            balU4 = (Integer.parseInt(balU4) - amount)+"";
            main_balanceTXTVW.setText(balU4);
            createNotif("You widthdraw "+ amount + " pesos.");
        }
        else if (activeUser == 5 && (Integer.parseInt(balU5) >= amount)) {
            balU5 = (Integer.parseInt(balU5) - amount)+"";
            main_balanceTXTVW.setText(balU5);
            createNotif("You widthdraw "+ amount + " pesos.");
        }
        else {
            Toast.makeText(this, "Insuficient balance!", Toast.LENGTH_SHORT).show();
        }
    }

    private void sendMoney() {
        if (activeUser == 1 && (Integer.parseInt(balU1) >= amount)) {
            balU1 = (Integer.parseInt(balU1) - amount)+"";
            main_balanceTXTVW.setText(balU1);
            createNotif("You send "+ amount + " pesos.");
        }
        else if (activeUser == 2 && (Integer.parseInt(balU2) >= amount)) {
            balU2 = (Integer.parseInt(balU2) - amount)+"";
            main_balanceTXTVW.setText(balU2);
            createNotif("You send "+ amount + " pesos.");
        }
        else if (activeUser == 3 && (Integer.parseInt(balU3) >= amount)) {
            balU3 = (Integer.parseInt(balU3) - amount)+"";
            main_balanceTXTVW.setText(balU3);
            createNotif("You send "+ amount + " pesos.");
        }
        else if (activeUser == 4 && (Integer.parseInt(balU4) >= amount)) {
            balU4 = (Integer.parseInt(balU4) - amount)+"";
            main_balanceTXTVW.setText(balU4);
            createNotif("You send "+ amount + " pesos.");
        }
        else if (activeUser == 5 && (Integer.parseInt(balU5) >= amount)) {
            balU5 = (Integer.parseInt(balU5) - amount)+"";
            main_balanceTXTVW.setText(balU5);
            createNotif("You send "+ amount + " pesos.");
        }
        else {
            Toast.makeText(this, "Insuficient balance!", Toast.LENGTH_SHORT).show();
        }
    }

    private void addMoney() {
        if (activeUser == 1) {
            balU1 = (Integer.parseInt(balU1) + amount)+"";
            main_balanceTXTVW.setText(balU1);
            createNotif("You added "+ amount + " pesos.");
        }
        else if (activeUser == 2) {
            balU2 = (Integer.parseInt(balU2) + amount)+"";
            main_balanceTXTVW.setText(balU2);
            createNotif("You added "+ amount + " pesos.");
        }
        else if (activeUser == 3) {
            balU3 = (Integer.parseInt(balU3) + amount)+"";
            main_balanceTXTVW.setText(balU3);
            createNotif("You added "+ amount + " pesos.");
        }
        else if (activeUser == 4) {
            balU4 = (Integer.parseInt(balU4) + amount)+"";
            main_balanceTXTVW.setText(balU4);
            createNotif("You added "+ amount + " pesos.");
        }
        else if (activeUser == 5) {
            balU5 = (Integer.parseInt(balU5) + amount)+"";
            main_balanceTXTVW.setText(balU5);
            createNotif("You added "+ amount + " pesos.");
        }
    }

    private void createNotif(String notifContent) {
        if (activeUser == 1) {
            if (u1NotifCount == 1) {
                u1NotifCount++;
                u1Notif2Contnent = notifContent;
                u1Notif2Date = date+"";
            }
            else if (u1NotifCount == 2) {
                u1NotifCount++;
                u1Notif3Contnent = notifContent;
                u1Notif3Date = date+"";
            }
            else if (u1NotifCount == 3) {
                u1NotifCount++;
                u1Notif4Contnent = notifContent;
                u1Notif4Date = date+"";
            }
            else if (u1NotifCount == 4) {
                u1NotifCount++;
                u1Notif5Contnent = notifContent;
                u1Notif5Date = date+"";
            }
            else {
                Toast.makeText(this, "Transactions limited!", Toast.LENGTH_SHORT).show();
            }
        }
        else if (activeUser == 2) {
            if (u2NotifCount == 1) {
                u2NotifCount++;
                u2Notif2Contnent = notifContent;
                u2Notif2Date = date+"";
            }
            else if (u2NotifCount == 2) {
                u2NotifCount++;
                u2Notif3Contnent = notifContent;
                u2Notif3Date = date+"";
            }
            else if (u2NotifCount == 3) {
                u2NotifCount++;
                u2Notif4Contnent = notifContent;
                u2Notif4Date = date+"";
            }
            else if (u2NotifCount == 4) {
                u2NotifCount++;
                u2Notif5Contnent = notifContent;
                u2Notif5Date = date+"";
            }
            else {
                Toast.makeText(this, "Transactions limited!", Toast.LENGTH_SHORT).show();
            }
        }
        else if (activeUser == 3) {
            if (u3NotifCount == 1) {
                u3NotifCount++;
                u3Notif2Contnent = notifContent;
                u3Notif2Date = date+"";
            }
            else if (u3NotifCount == 2) {
                u3NotifCount++;
                u3Notif3Contnent = notifContent;
                u3Notif3Date = date+"";
            }
            else if (u3NotifCount == 3) {
                u3NotifCount++;
                u3Notif4Contnent = notifContent;
                u3Notif4Date = date+"";
            }
            else if (u3NotifCount == 4) {
                u3NotifCount++;
                u3Notif5Contnent = notifContent;
                u3Notif5Date = date+"";
            }
            else {
                Toast.makeText(this, "Transactions limited!", Toast.LENGTH_SHORT).show();
            }
        }
        else if (activeUser == 4) {
            if (u4NotifCount == 1) {
                u4NotifCount++;
                u4Notif2Contnent = notifContent;
                u4Notif2Date = date+"";
            }
            else if (u4NotifCount == 2) {
                u4NotifCount++;
                u4Notif3Contnent = notifContent;
                u4Notif3Date = date+"";
            }
            else if (u4NotifCount == 3) {
                u4NotifCount++;
                u4Notif4Contnent = notifContent;
                u4Notif4Date = date+"";
            }
            else if (u4NotifCount == 4) {
                u4NotifCount++;
                u4Notif5Contnent = notifContent;
                u4Notif5Date = date+"";
            }
            else {
                Toast.makeText(this, "Transactions limited!", Toast.LENGTH_SHORT).show();
            }
        }
        else if (activeUser == 5) {
            if (u5NotifCount == 1) {
                u5NotifCount++;
                u5Notif2Contnent = notifContent;
                u5Notif2Date = date+"";
            }
            else if (u5NotifCount == 2) {
                u5NotifCount++;
                u5Notif3Contnent = notifContent;
                u5Notif3Date = date+"";
            }
            else if (u5NotifCount == 3) {
                u5NotifCount++;
                u5Notif4Contnent = notifContent;
                u5Notif4Date = date+"";
            }
            else if (u5NotifCount == 4) {
                u5NotifCount++;
                u5Notif5Contnent = notifContent;
                u5Notif5Date = date+"";
            }
            else {
                Toast.makeText(this, "Transactions limited!", Toast.LENGTH_SHORT).show();
            }
        }
        displayNotifications();
    }

    private void setBalance() {
        if (activeUser == 1) {
            main_balanceTXTVW.setText(balU1);
        }
        else if (activeUser == 2) {
            main_balanceTXTVW.setText(balU2);
        }
        else if (activeUser == 3) {
            main_balanceTXTVW.setText(balU3);
        }
        else if (activeUser == 4) {
            main_balanceTXTVW.setText(balU4);
        }
        else if (activeUser == 5) {
            main_balanceTXTVW.setText(balU5);
        }

    }

    private void setUserName() {
        if (activeUser == 1) {
            main_FnameTXTVW.setText(fNameU1);
            main_LnameTXTVW.setText(lNameU1);
        }
        else if (activeUser == 2) {
            main_FnameTXTVW.setText(fNameU2);
            main_LnameTXTVW.setText(lNameU2);
        }
        else if (activeUser == 3) {
            main_FnameTXTVW.setText(fNameU3);
            main_LnameTXTVW.setText(lNameU3);
        }
        else if (activeUser == 4) {
            main_FnameTXTVW.setText(fNameU4);
            main_LnameTXTVW.setText(lNameU4);
        }
        else if (activeUser == 5) {
            main_FnameTXTVW.setText(fNameU5);
            main_LnameTXTVW.setText(lNameU5);
        }

    }

    private void displayNotifications() {
        main_notification1LNRLYT.setVisibility(View.GONE);
        main_notification2LNRLYT.setVisibility(View.GONE);
        main_notification3LNRLYT.setVisibility(View.GONE);
        main_notification4LNRLYT.setVisibility(View.GONE);
        main_notification5LNRLYT.setVisibility(View.GONE);

        if (activeUser == 1) {
            if (u1NotifCount >= 1) {
                main_notification1LNRLYT.setVisibility(View.VISIBLE);
                main_notification1TXTVW.setText(u1Notif1Contnent + fNameU1 + "\n\n" + u1Notif1Date);
            }
            if (u1NotifCount >= 2) {
                main_notification2LNRLYT.setVisibility(View.VISIBLE);
                main_notification2TXTVW.setText(u1Notif2Contnent + "\n\n" + u1Notif2Date);
            }
            if (u1NotifCount >= 3) {
                main_notification3LNRLYT.setVisibility(View.VISIBLE);
                main_notification3TXTVW.setText(u1Notif3Contnent + "\n\n" + u1Notif3Date);
            }
            if (u1NotifCount >= 4) {
                main_notification4LNRLYT.setVisibility(View.VISIBLE);
                main_notification4TXTVW.setText(u1Notif4Contnent + "\n\n" + u1Notif4Date);
            }
            if (u1NotifCount >= 5) {
                main_notification5LNRLYT.setVisibility(View.VISIBLE);
                main_notification5TXTVW.setText(u1Notif5Contnent + "\n\n" + u1Notif5Date);
            }
        }
        else if (activeUser == 2) {
            if (u2NotifCount >= 1) {
                main_notification1LNRLYT.setVisibility(View.VISIBLE);
                main_notification1TXTVW.setText(u2Notif1Contnent + fNameU2  + "\n\n" + u2Notif1Date);
            }
            if (u2NotifCount >= 2) {
                main_notification2LNRLYT.setVisibility(View.VISIBLE);
                main_notification2TXTVW.setText(u2Notif2Contnent + "\n\n" + u2Notif2Date);
            }
            if (u2NotifCount >= 3) {
                main_notification3LNRLYT.setVisibility(View.VISIBLE);
                main_notification3TXTVW.setText(u2Notif3Contnent + "\n\n" + u2Notif3Date);
            }
            if (u2NotifCount >= 4) {
                main_notification4LNRLYT.setVisibility(View.VISIBLE);
                main_notification4TXTVW.setText(u2Notif4Contnent + "\n\n" + u2Notif4Date);
            }
            if (u2NotifCount >= 5) {
                main_notification5LNRLYT.setVisibility(View.VISIBLE);
                main_notification5TXTVW.setText(u2Notif5Contnent + "\n\n" + u2Notif5Date);
            }
        }
        else if (activeUser == 3) {
            if (u3NotifCount >= 1) {
                main_notification1LNRLYT.setVisibility(View.VISIBLE);
                main_notification1TXTVW.setText(u3Notif1Contnent + fNameU3 + "\n\n" + u3Notif1Date);
            }
            if (u3NotifCount >= 2) {
                main_notification2LNRLYT.setVisibility(View.VISIBLE);
                main_notification2TXTVW.setText(u3Notif2Contnent + "\n\n" + u3Notif2Date);
            }
            if (u3NotifCount >= 3) {
                main_notification3LNRLYT.setVisibility(View.VISIBLE);
                main_notification3TXTVW.setText(u3Notif3Contnent + "\n\n" + u3Notif3Date);
            }
            if (u3NotifCount >= 4) {
                main_notification4LNRLYT.setVisibility(View.VISIBLE);
                main_notification4TXTVW.setText(u3Notif4Contnent + "\n\n" + u3Notif4Date);
            }
            if (u3NotifCount >= 5) {
                main_notification5LNRLYT.setVisibility(View.VISIBLE);
                main_notification5TXTVW.setText(u3Notif5Contnent + "\n\n" + u3Notif5Date);
            }
        }
        else if (activeUser == 4) {
            if (u4NotifCount >= 1) {
                main_notification1LNRLYT.setVisibility(View.VISIBLE);
                main_notification1TXTVW.setText(u4Notif1Contnent + fNameU4 + "\n\n" + u4Notif1Date);
            }
            if (u4NotifCount >= 2) {
                main_notification2LNRLYT.setVisibility(View.VISIBLE);
                main_notification2TXTVW.setText(u4Notif2Contnent + "\n\n" + u4Notif2Date);
            }
            if (u4NotifCount >= 3) {
                main_notification3LNRLYT.setVisibility(View.VISIBLE);
                main_notification3TXTVW.setText(u4Notif3Contnent + "\n\n" + u4Notif3Date);
            }
            if (u4NotifCount >= 4) {
                main_notification4LNRLYT.setVisibility(View.VISIBLE);
                main_notification4TXTVW.setText(u4Notif4Contnent + "\n\n" + u4Notif4Date);
            }
            if (u4NotifCount >= 5) {
                main_notification5LNRLYT.setVisibility(View.VISIBLE);
                main_notification5TXTVW.setText(u4Notif5Contnent + "\n\n" + u4Notif5Date);
            }
        }
        else if (activeUser == 5) {
            if (u5NotifCount >= 1) {
                main_notification1LNRLYT.setVisibility(View.VISIBLE);
                main_notification1TXTVW.setText(u5Notif1Contnent + fNameU5 + "\n\n" + u5Notif1Date);
            }
            if (u5NotifCount >= 2) {
                main_notification2LNRLYT.setVisibility(View.VISIBLE);
                main_notification2TXTVW.setText(u5Notif2Contnent + "\n\n" + u5Notif2Date);
            }
            if (u5NotifCount >= 3) {
                main_notification3LNRLYT.setVisibility(View.VISIBLE);
                main_notification3TXTVW.setText(u5Notif3Contnent + "\n\n" + u5Notif3Date);
            }
            if (u5NotifCount >= 4) {
                main_notification4LNRLYT.setVisibility(View.VISIBLE);
                main_notification4TXTVW.setText(u5Notif4Contnent + "\n\n" + u5Notif4Date);
            }
            if (u5NotifCount >= 5) {
                main_notification5LNRLYT.setVisibility(View.VISIBLE);
                main_notification5TXTVW.setText(u5Notif5Contnent + "\n\n" + u5Notif5Date);
            }
        }
    }


    int  backpressCount = 0;
    @Override
    public void onBackPressed() {
        if (activeLayout.equals("lyt_login")) {
            backpressCount++;
            if (backpressCount == 2) {
                super.onBackPressed();
            }
            else {
                Toast.makeText(this, "Press again to exit.", Toast.LENGTH_SHORT).show();
            }
        }
        else if (activeLayout.equals("lyt_main")) {
            backpressCount=0;
            logInActivity();
        }
        else if (activeLayout.equals("lyt_register")) {
            backpressCount=0;
            logInActivity();
        }
    }
}
