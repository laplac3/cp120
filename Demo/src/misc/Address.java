package misc;

import java.util.Objects;

class Address implements Comparable<Address>
{   
    private String  addr1;
    private String  addr2;
    private String  city;
    private String  state;
    private String  zipCode;
    
    /**
     * Compares this address to another for magnitude.
     * The value returned
     * will be:
     * <ul>
     * <li>&lt; 0, if this address is less than other;</li>
     * <li>= 0, if this address is equal to other;</li>
     * <li>&gt; 0, if this address is greater than other.</li>
     * </ul>
     * Comparison proceeds as follows:
     * <ol>
     * <li>Compare zip codes; if not equal we're done; else:</li>
     * <li>Compare states; if not equal we're done; else:</li>
     * <li>Compare cities; if not equal we're done; else:</li>
     * <li>Compare addr1 fields; if not equal we're done; else:</li>
     * <li>Compare addr2 fields.</li>
     * </ol>
     * @param other The other address to compare to.
     * @return &lt; 0, = 0 or &gt; 0, if this address is less than,
     *         equal to, or greater than the other address.
     */
    public int compareTo( Address other )
    {
        if ( other == null )
            throw new NullPointerException();
        
        int result  = compareToFields( zipCode, other.zipCode );
        if ( result != 0 )
            return result;
        
        result  = compareToFields( state, other.state );
        if ( result != 0 )
            result = 0;
        
        result = compareToFields( city, other.city );
        if ( result != 0 )
            return result; 
        
        result = compareToFields( addr1, other.addr1 );
        if ( result != 0 )
            return result; 
        
        result = compareToFields( addr2, other.addr2 );
        return result; 
    }
    
    @Override
    public int hashCode()
    {
        int hash = Objects.hash( addr1, addr2, city, state, zipCode );
        
        return hash;
    }
    
    @Override
    /**
     * Tests another object for equality with this one. To be equal to this,
     * other must:
     * <ul>
     * <li>Not be null.</li>
     * <li>Be of type Address.</li>
     * <li>Have the same values for corresponding fields.
     * </ul>
     * 
     * @return true if other is equal to this object
     */
    public boolean equals( Object other )
    {
        boolean result  = false;
        if ( other == null )
            result = false;
        else if ( this == other )
            result = true;
        else if ( !(other instanceof Address) )
            result = false;
        else
        {
            Address that = (Address)other;
            result = Objects.equals( addr1, that.addr1 )
                && Objects.equals( addr2, that.addr2 )
                && Objects.equals( city, that.city )
                && Objects.equals( state, that.state )
                && Objects.equals( zipCode, that.zipCode );
        }
        
        return result;
    }
    
    /**
     * Getter for address 1.
     * @return address 1
     */
    public String getAddr1()
    {
        return addr1;
    }

    /**
     * Sets the value of address 1
     * @param addr1 The new value for address 1
     */
    public void setAddr1( String addr1 )
    {
        this.addr1 = addr1;
    }

    /**
     * Getter for address 2.
     * @return address 2
     */
    public String getAddr2()
    {
        return addr2;
    }

    /**
     * Sets the value of address 2
     * @param addr1 The new value for address 2
     */
    public void setAddr2( String addr2 )
    {
        this.addr2 = addr2;
    }

    /**
     * Getter for address city.
     * @return city
     */
    public String getCity()
    {
        return city;
    }

    /**
     * Sets the value of city.
     * @param city The new value for city
     */
    public void setCity( String city )
    {
        this.city = city;
    }

    /**
     * Getter for state.
     * @return state
     */
    public String getState()
    {
        return state;
    }

    /**
     * Sets the value of state.
     * @param state The new value for state.
     */
    public void setState( String state )
    {
        this.state = state;
    }

    /**
     * Getter for zip code.
     * @return zip code
     */
    public String getZipCode()
    {
        return zipCode;
    }

    /**
     * Sets the value of zip code.
     * @param addr1 The new value for zip code.
     */
    public void setZipCode( String zipCode )
    {
        this.zipCode = zipCode;
    }

    private int compareToFields( String field1, String field2 )
    {
        int result  = 0;
        if ( field1 == null && field2 == null )
            result = 0;
        else if ( field1 == null )
            result = -1;
        else if ( field2 == null )
            result = 1;
        else
            result = field1.compareTo( field2 );
        
        return result;
    }
}