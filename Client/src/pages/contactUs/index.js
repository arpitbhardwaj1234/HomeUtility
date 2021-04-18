import React from 'react';
import Header from '../../components/header';
import "./style.css";

const ContactUs = () => {
    return (
        <div>
            <Header />
            <div class="login-wrap">
                <div class="login-html">
                    <h2 className="white">Contact Us At:</h2>

                    <h4 className="white mt-5">Arpit Bharadwaj</h4>
                    <p className="white">No: 9639614074 </p>
                    <h4 className="white mt-5">Yshika Agarwal</h4>
                    <p className="white">No: 8859979054</p>
                    <div style={{ textAlign: "center", marginTop: "60px" }}>
                        <img src="love.png" width="100" />
                    </div>
                </div>
            </div>
        </div>
    );
}

export default ContactUs;
