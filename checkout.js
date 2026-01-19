function calculatePrice(amount) {
    const gstPrice = amount * 1.18;
    return gstPrice + 50;
}

module.exports = calculatePrice;
