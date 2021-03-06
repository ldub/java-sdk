package com.constantcontact.components.eventspot;

import com.constantcontact.components.Component;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * TrackInformation for the Events in Constant Contact.
 *
 * @author ConstantContact
 * @see EventSpotService
 */
public class TrackInformation extends Component implements Serializable{

    /**
     * Serial version unique identifier.
     */
    private static final long serialVersionUID = -678644077929558066L;

    /**
     * Date on which early fees end, in ISO-8601 format
     */
    private String earlyFeeDate;

    /**
     *  How guests are referred to on the registration form
     */
    private String guestDisplayLabel;

    /**
     * Number of guests each registrant can bring, 0 - 100, default = 0
     */
    private Integer guestLimit;

    /**
     * Determines if the Who (CONTACT), When (TIME), or Where (LOCATION) information is shown on the Event page.
     */
    private List<String> informationSections;

    /**
     * Default = false; Set to true to display the guest count field on the registration form;
     * if true, is_guest_name_required must be set to false (default).
     */
    private boolean isGuestAnonymousEnabled;

    /**
     * Default = false. Set to display guest name fields on registration form;
     * if true, then is_guest_anonymous_enabled must be set false (default).
     */
    private boolean isGuestNameRequired;

    /**
     * Default = false; Manually closes the event registration when set to true, takes precedence over registration_limit_date and
     * registration_limit_count settings
     */
    private boolean isRegistrationClosedManually;

    /**
     * Default = false; Set to true provide a link for registrants to retrieve an event ticket after they register.
     */
    private boolean isTicketingLinkDisplayed;

    /**
     * Date after which late fees apply, in ISO-8601 format
     */
    private String lateFeeDate;

    /**
     * Specifies the maximum number of registrants for the event
     */
    private Integer registrationLimitCount;

    /**
     * Date when event registrations close, in ISO-8601 format
     */
    private String registrationLimitDate;


    /**
     * Get the earlyFeeDate.
     *
     * @return The {@link #earlyFeeDate}
     */
    @JsonProperty("early_fee_date")
    public String getEarlyFeeDate() {
        return earlyFeeDate;
    }

    /**
     * Get the guestDisplayLabel.
     *
     * @return The {@link #guestDisplayLabel}
     */
    @JsonProperty("guest_display_label")
    public String getGuestDisplayLabel() {
        return guestDisplayLabel;
    }

    /**
     * Get the guestLimit.
     *
     * @return The {@link #guestLimit}
     */
    @JsonProperty("guest_limit")
    public Integer getGuestLimit() {
        return guestLimit;
    }

    /**
     * Get the informationSections.
     *
     * @return The {@link #informationSections}
     */
    @JsonProperty("information_sections")
    public List<String> getInformationSections() {
        return informationSections;
    }

    /**
     * Get the isGuestAnonymousEnabled.
     *
     * @return The {@link #isGuestAnonymousEnabled}
     */
    @JsonProperty("is_guest_anonymous_enabled")
    public boolean isGuestAnonymousEnabled() {
        return isGuestAnonymousEnabled;
    }

    /**
     * Get the isGuestNameRequired.
     *
     * @return The {@link #isGuestNameRequired}
     */
    @JsonProperty("is_guest_name_required")
    public boolean isGuestNameRequired() {
        return isGuestNameRequired;
    }

    /**
     * Get the isRegistrationClosedManually.
     *
     * @return The {@link #isRegistrationClosedManually}
     */
    @JsonProperty("is_registration_closed_manually")
    public boolean isRegistrationClosedManually() {
        return isRegistrationClosedManually;
    }

    /**
     * Get the isTicketingLinkDisplayed.
     *
     * @return The {@link #isTicketingLinkDisplayed}
     */
    @JsonProperty("is_ticketing_link_displayed")
    public boolean isTicketingLinkDisplayed() {
        return isTicketingLinkDisplayed;
    }

    /**
     * Get the lateFeeDate.
     *
     * @return The {@link #lateFeeDate}
     */
    @JsonProperty("late_fee_date")
    public String getLateFeeDate() {
        return lateFeeDate;
    }

    /**
     * Get the registrationLimitCount.
     *
     * @return The {@link #registrationLimitCount}
     */
    @JsonProperty("registration_limit_count")
    public Integer getRegistrationLimitCount() {
        return registrationLimitCount;
    }

    /**
     * Get the registrationLimitDate.
     *
     * @return The {@link #registrationLimitDate}
     */
    @JsonProperty("registration_limit_date")
    public String getRegistrationLimitDate() {
        return registrationLimitDate;
    }


    /**
     * Set the earlyFeeDate.
     *
     * @param earlyFeeDate The earlyFeeDate.
     */
    public void setEarlyFeeDate(String earlyFeeDate) {
        this.earlyFeeDate = earlyFeeDate;
    }

    /**
     * Set the guestDisplayLabel.
     *
     * @param guestDisplayLabel The guestDisplayLabel.
     */
    public void setGuestDisplayLabel(String guestDisplayLabel) {
        this.guestDisplayLabel = guestDisplayLabel;
    }

    /**
     * Set the guestLimit.
     *
     * @param guestLimit The guestLimit.
     */
    public void setGuestLimit(Integer guestLimit) {
        this.guestLimit = guestLimit;
    }

    /**
     * Set the informationSections.
     *
     * @param informationSections The informationSections.
     */
    public void setInformationSections(List<String> informationSections) {
        this.informationSections = informationSections;
    }

    /**
     * Set the isGuestAnonymousEnabled.
     *
     * @param isGuestAnonymousEnabled The isGuestAnonymousEnabled.
     */
    public void setGuestAnonymousEnabled(boolean isGuestAnonymousEnabled) {
        this.isGuestAnonymousEnabled = isGuestAnonymousEnabled;
    }

    /**
     * Set the isGuestNameRequired.
     *
     * @param isGuestNameRequired The isGuestNameRequired.
     */
    public void setGuestNameRequired(boolean isGuestNameRequired) {
        this.isGuestNameRequired = isGuestNameRequired;
    }

    /**
     * Set the isRegistrationClosedManually.
     *
     * @param isRegistrationClosedManually The isRegistrationClosedManually.
     */
    public void setRegistrationClosedManually(boolean isRegistrationClosedManually) {
        this.isRegistrationClosedManually = isRegistrationClosedManually;
    }

    /**
     * Set the isTicketingLinkDisplayed.
     *
     * @param isTicketingLinkDisplayed The isTicketingLinkDisplayed.
     */
    public void setTicketingLinkDisplayed(boolean isTicketingLinkDisplayed) {
        this.isTicketingLinkDisplayed = isTicketingLinkDisplayed;
    }

    /**
     * Set the lateFeeDate.
     *
     * @param lateFeeDate The lateFeeDate.
     */
    public void setLateFeeDate(String lateFeeDate) {
        this.lateFeeDate = lateFeeDate;
    }

    /**
     * Set the registrationLimitCount.
     *
     * @param registrationLimitCount The registrationLimitCount.
     */
    public void setRegistrationLimitCount(Integer registrationLimitCount) {
        this.registrationLimitCount = registrationLimitCount;
    }

    /**
     * Set the registrationLimitDate.
     *
     * @param registrationLimitDate The registrationLimitDate.
     */
    public void setRegistrationLimitDate(String registrationLimitDate) {
        this.registrationLimitDate = registrationLimitDate;
    }


    /**
     * Information sections constants for the usage of {@link TrackInformation} in Constant Contact
     *
     * @author ConstantContact
     */
    public static final class InformationSections {
        /**
         * CONTACT - displays the event contact information
         */
        public static final String CONTACT = "CONTACT";

        /**
         * TIME - displays the event date and time
         */
        public static final String TIME = "TIME";

        /**
         * LOCATION - displays the event location
         */
        public static final String LOCATION = "LOCATION";

        /**
         * Default constructor.<br/>
         * Made private to prevent instantiation.<br/>
         * This is unreachable from the outside, since current class is used only as a repository for constants.
         */
        private InformationSections() {
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("TrackInformation [early_fee_date=");
        builder.append(earlyFeeDate);
        builder.append(", guest_display_label=");
        builder.append(guestDisplayLabel);
        builder.append(", guest_limit=");
        builder.append(guestLimit);
        builder.append(", information_sections=");
        builder.append(informationSections);
        builder.append(", is_guest_anonymous_enabled=");
        builder.append(isGuestAnonymousEnabled);
        builder.append(", is_guest_name_required=");
        builder.append(isGuestNameRequired);
        builder.append(", is_registration_closed_manually=");
        builder.append(isRegistrationClosedManually);
        builder.append(", is_ticketing_link_displayed=");
        builder.append(isTicketingLinkDisplayed);
        builder.append(", late_fee_date=");
        builder.append(lateFeeDate);
        builder.append(", registration_limit_count=");
        builder.append(registrationLimitCount);
        builder.append(", registration_limit_date=");
        builder.append(registrationLimitDate);
        builder.append("]");

        return builder.toString();
    }

    /**
     * Default constructor.
     */
    public TrackInformation() {
        super();
    }
}
