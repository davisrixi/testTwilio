/**
 * Created by darien on 11/27/2015.
 */
// You may want to be more specific in your imports
import java.util.*;
import com.twilio.sdk.*;
import com.twilio.sdk.resource.factory.*;
import com.twilio.sdk.resource.instance.*;
import com.twilio.sdk.resource.list.*;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

public class TwilioTest {
    // Find your Account Sid and Token at twilio.com/user/account
    public static final String ACCOUNT_SID = "AC02e122a3bbe69b1e2ecce3617df5b217";
    public static final String AUTH_TOKEN = "fa49b19757dbcd4292e47929b8538890";

    public static void main(String[]args) throws TwilioRestException {
        TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);

        // Build the parameters
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("To", "+51987575222"));
        params.add(new BasicNameValuePair("From", "+12156470008"));
        params.add(new BasicNameValuePair("Body", "Esto es una prueba!"));

        MessageFactory messageFactory = client.getAccount().getMessageFactory();
        Message message = messageFactory.create(params);
        System.out.println(message.getSid());
    }
}