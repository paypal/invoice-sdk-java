
/**
 * Auto generated code
 */

package com.paypal.svcs.types.pt;

import com.paypal.svcs.types.pt.ActorType;
import com.paypal.svcs.types.pt.OriginType;
import com.paypal.svcs.types.pt.StatusType;
import java.util.Map;


/**
 * Invoice details about the invoice status and state change dates.
 */
public class InvoiceDetailsType {

	/**
	 * Status of the invoice.
	 *
	 * @Required
	 */
	private StatusType status;
	public StatusType getStatus() {
		return status;
	}
	public void setStatus(StatusType value) {
		this.status = value;
	}

	/**
	 * The total amount of the invoice (cost of items, shipping and tax, less any discount).
	 * This field is set by the invoicing system and will ignore any changes made by API callers.
	 */
	private Double totalAmount;
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double value) {
		this.totalAmount = value;
	}

	/**
	 * Whether the invoice was created via the website or via an API call.
	 *
	 * @Required
	 */
	private OriginType origin;
	public OriginType getOrigin() {
		return origin;
	}
	public void setOrigin(OriginType value) {
		this.origin = value;
	}

	/**
	 * Date when the invoice was created.
	 *
	 * @Required
	 */
	private String createdDate;
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String value) {
		this.createdDate = value;
	}

	/**
	 * Account that created the invoice.
	 */
	private String createdBy;
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String value) {
		this.createdBy = value;
	}

	/**
	 * If canceled, date when the invoice was canceled.
	 */
	private String canceledDate;
	public String getCanceledDate() {
		return canceledDate;
	}
	public void setCanceledDate(String value) {
		this.canceledDate = value;
	}

	/**
	 * Actor who canceled the invoice.
	 */
	private ActorType canceledByActor;
	public ActorType getCanceledByActor() {
		return canceledByActor;
	}
	public void setCanceledByActor(ActorType value) {
		this.canceledByActor = value;
	}

	/**
	 * Account that canceled the invoice.
	 */
	private String canceledBy;
	public String getCanceledBy() {
		return canceledBy;
	}
	public void setCanceledBy(String value) {
		this.canceledBy = value;
	}

	/**
	 * Date when the invoice was last edited.
	 */
	private String lastUpdatedDate;
	public String getLastUpdatedDate() {
		return lastUpdatedDate;
	}
	public void setLastUpdatedDate(String value) {
		this.lastUpdatedDate = value;
	}

	/**
	 * Account that last edited the invoice.
	 */
	private String lastUpdatedBy;
	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}
	public void setLastUpdatedBy(String value) {
		this.lastUpdatedBy = value;
	}

	/**
	 * Date when the invoice was first sent.
	 */
	private String firstSentDate;
	public String getFirstSentDate() {
		return firstSentDate;
	}
	public void setFirstSentDate(String value) {
		this.firstSentDate = value;
	}

	/**
	 * Date when the invoice was last sent.
	 */
	private String lastSentDate;
	public String getLastSentDate() {
		return lastSentDate;
	}
	public void setLastSentDate(String value) {
		this.lastSentDate = value;
	}

	/**
	 * Account that last sent the invoice.
	 */
	private String lastSentBy;
	public String getLastSentBy() {
		return lastSentBy;
	}
	public void setLastSentBy(String value) {
		this.lastSentBy = value;
	}

	/**
	 * If the invoice was paid, date when the invoice was paid.
	 */
	private String paidDate;
	public String getPaidDate() {
		return paidDate;
	}
	public void setPaidDate(String value) {
		this.paidDate = value;
	}


	public InvoiceDetailsType() {
	}
	public InvoiceDetailsType(Map<String, String> map, String prefix) {
		int i=0; 
		if( map.containsKey(prefix + "status") ) {
			this.status = StatusType.fromValue( map.get(prefix + "status") );
		}
		if( map.containsKey(prefix + "totalAmount") ) {
			this.totalAmount = Double.valueOf(map.get(prefix + "totalAmount"));
		}
		if( map.containsKey(prefix + "origin") ) {
			this.origin = OriginType.fromValue( map.get(prefix + "origin") );
		}
		if( map.containsKey(prefix + "createdDate") ) {
			this.createdDate = map.get(prefix + "createdDate");
		}
		if( map.containsKey(prefix + "createdBy") ) {
			this.createdBy = map.get(prefix + "createdBy");
		}
		if( map.containsKey(prefix + "canceledDate") ) {
			this.canceledDate = map.get(prefix + "canceledDate");
		}
		if( map.containsKey(prefix + "canceledByActor") ) {
			this.canceledByActor = ActorType.fromValue( map.get(prefix + "canceledByActor") );
		}
		if( map.containsKey(prefix + "canceledBy") ) {
			this.canceledBy = map.get(prefix + "canceledBy");
		}
		if( map.containsKey(prefix + "lastUpdatedDate") ) {
			this.lastUpdatedDate = map.get(prefix + "lastUpdatedDate");
		}
		if( map.containsKey(prefix + "lastUpdatedBy") ) {
			this.lastUpdatedBy = map.get(prefix + "lastUpdatedBy");
		}
		if( map.containsKey(prefix + "firstSentDate") ) {
			this.firstSentDate = map.get(prefix + "firstSentDate");
		}
		if( map.containsKey(prefix + "lastSentDate") ) {
			this.lastSentDate = map.get(prefix + "lastSentDate");
		}
		if( map.containsKey(prefix + "lastSentBy") ) {
			this.lastSentBy = map.get(prefix + "lastSentBy");
		}
		if( map.containsKey(prefix + "paidDate") ) {
			this.paidDate = map.get(prefix + "paidDate");
		}
	}
}
