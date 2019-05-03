package com.kishore.anant.json;

import org.codehaus.jackson.annotate.JsonIgnore;

public class ErrorDetail
{
    private String code;

    private String message;

    //@JsonIgnore
    private String longtext_url;

    @JsonIgnore
    private String propertyref;
    
    //@JsonIgnore

    private String severity;

    private String target;

    public String getCode ()
    {
        return code;
    }

    public void setCode (String code)
    {
        this.code = code;
    }

    public String getMessage ()
    {
        return message;
    }

    public void setMessage (String message)
    {
        this.message = message;
    }

    public String getLongtext_url ()
    {
        return longtext_url;
    }

    public void setLongtext_url (String longtext_url)
    {
        this.longtext_url = longtext_url;
    }

    public String getPropertyref ()
    {
        return propertyref;
    }

    public void setPropertyref (String propertyref)
    {
        this.propertyref = propertyref;
    }

    public String getSeverity ()
    {
        return severity;
    }

    public void setSeverity (String severity)
    {
        this.severity = severity;
    }

    public String getTarget ()
    {
        return target;
    }

    public void setTarget (String target)
    {
        this.target = target;
    }



	@Override
	public String toString() {
		return "ErrorDetail [code=" + code + ", message=" + message + ", longtext_url=" + longtext_url
				+ ", propertyref=" + propertyref +" severity=" + severity + ", target="
				+ target + "]";
	}
    
	
    

}
