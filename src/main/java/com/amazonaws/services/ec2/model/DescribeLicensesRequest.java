/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeLicenses(DescribeLicensesRequest) DescribeLicenses operation}.
 * <p>
 * Provides details of a user's registered licenses. Zero or more IDs
 * may be specified on the call. When one or more license IDs are
 * specified, only data for the specified IDs are returned.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeLicenses(DescribeLicensesRequest)
 */
public class DescribeLicensesRequest extends AmazonWebServiceRequest {

    /**
     * Specifies the license registration for which details are to be
     * returned.
     */
    private java.util.List<String> licenseIds;

    /**
     * Specifies the license registration for which details are to be
     * returned.
     *
     * @return Specifies the license registration for which details are to be
     *         returned.
     */
    public java.util.List<String> getLicenseIds() {
        if (licenseIds == null) {
            licenseIds = new java.util.ArrayList<String>();
        }
        return licenseIds;
    }
    
    /**
     * Specifies the license registration for which details are to be
     * returned.
     *
     * @param licenseIds Specifies the license registration for which details are to be
     *         returned.
     */
    public void setLicenseIds(java.util.Collection<String> licenseIds) {
        java.util.List<String> licenseIdsCopy = new java.util.ArrayList<String>();
        if (licenseIds != null) {
            licenseIdsCopy.addAll(licenseIds);
        }
        this.licenseIds = licenseIdsCopy;
    }
    
    /**
     * Specifies the license registration for which details are to be
     * returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param licenseIds Specifies the license registration for which details are to be
     *         returned.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeLicensesRequest withLicenseIds(String... licenseIds) {
        for (String value : licenseIds) {
            getLicenseIds().add(value);
        }
        return this;
    }
    
    /**
     * Specifies the license registration for which details are to be
     * returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param licenseIds Specifies the license registration for which details are to be
     *         returned.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeLicensesRequest withLicenseIds(java.util.Collection<String> licenseIds) {
        java.util.List<String> licenseIdsCopy = new java.util.ArrayList<String>();
        if (licenseIds != null) {
            licenseIdsCopy.addAll(licenseIds);
        }
        this.licenseIds = licenseIdsCopy;

        return this;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("LicenseIds: " + licenseIds + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    