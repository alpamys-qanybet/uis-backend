/*! SmartAdmin - v1.4.1 - 2014-06-26 */
!function (a, b, c) {
    function d() {
        e = b[h](function () {
            f.each(function () {
                var b = a(this), c = b.width(), d = b.height(), e = a.data(this, j);
                (c !== e.w || d !== e.h) && b.trigger(i, [e.w = c, e.h = d])
            }), d()
        }, g[k])
    }

    var e, f = a([]), g = a.resize = a.extend(a.resize, {}), h = "setTimeout", i = "resize", j = i + "-special-event", k = "delay", l = "throttleWindow";
    g[k] = 250, g[l] = !0, a.event.special[i] = {setup: function () {
        if (!g[l] && this[h])return!1;
        var b = a(this);
        f = f.add(b), a.data(this, j, {w: b.width(), h: b.height()}), 1 === f.length && d()
    }, teardown: function () {
        if (!g[l] && this[h])return!1;
        var b = a(this);
        f = f.not(b), b.removeData(j), f.length || clearTimeout(e)
    }, add: function (b) {
        function d(b, d, f) {
            var g = a(this), h = a.data(this, j);
            h.w = d !== c ? d : g.width(), h.h = f !== c ? f : g.height(), e.apply(this, arguments)
        }

        if (!g[l] && this[h])return!1;
        var e;
        return a.isFunction(b) ? (e = b, d) : (e = b.handler, void(b.handler = d))
    }}
}(jQuery, this), function (a) {
    function b(a) {
        function b() {
            var b = a.getPlaceholder();
            0 != b.width() && 0 != b.height() && (a.resize(), a.setupGrid(), a.draw())
        }

        function c(a) {
            a.getPlaceholder().resize(b)
        }

        function d(a) {
            a.getPlaceholder().unbind("resize", b)
        }

        a.hooks.bindEvents.push(c), a.hooks.shutdown.push(d)
    }

    var c = {};
    a.plot.plugins.push({init: b, options: c, name: "resize", version: "1.0"})
}(jQuery);