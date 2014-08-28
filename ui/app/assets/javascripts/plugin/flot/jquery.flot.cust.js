/*! SmartAdmin - v1.4.1 - 2014-06-26 */
!function (a) {
    a.color = {}, a.color.make = function (b, c, d, e) {
        var f = {};
        return f.r = b || 0, f.g = c || 0, f.b = d || 0, f.a = null != e ? e : 1, f.add = function (a, b) {
            for (var c = 0; c < a.length; ++c)f[a.charAt(c)] += b;
            return f.normalize()
        }, f.scale = function (a, b) {
            for (var c = 0; c < a.length; ++c)f[a.charAt(c)] *= b;
            return f.normalize()
        }, f.toString = function () {
            return f.a >= 1 ? "rgb(" + [f.r, f.g, f.b].join(",") + ")" : "rgba(" + [f.r, f.g, f.b, f.a].join(",") + ")"
        }, f.normalize = function () {
            function a(a, b, c) {
                return a > b ? a : b > c ? c : b
            }

            return f.r = a(0, parseInt(f.r), 255), f.g = a(0, parseInt(f.g), 255), f.b = a(0, parseInt(f.b), 255), f.a = a(0, f.a, 1), f
        }, f.clone = function () {
            return a.color.make(f.r, f.b, f.g, f.a)
        }, f.normalize()
    }, a.color.extract = function (b, c) {
        var d;
        do {
            if (d = b.css(c).toLowerCase(), "" != d && "transparent" != d)break;
            b = b.parent()
        } while (!a.nodeName(b.get(0), "body"));
        return"rgba(0, 0, 0, 0)" == d && (d = "transparent"), a.color.parse(d)
    }, a.color.parse = function (c) {
        var d, e = a.color.make;
        if (d = /rgb\(\s*([0-9]{1,3})\s*,\s*([0-9]{1,3})\s*,\s*([0-9]{1,3})\s*\)/.exec(c))return e(parseInt(d[1], 10), parseInt(d[2], 10), parseInt(d[3], 10));
        if (d = /rgba\(\s*([0-9]{1,3})\s*,\s*([0-9]{1,3})\s*,\s*([0-9]{1,3})\s*,\s*([0-9]+(?:\.[0-9]+)?)\s*\)/.exec(c))return e(parseInt(d[1], 10), parseInt(d[2], 10), parseInt(d[3], 10), parseFloat(d[4]));
        if (d = /rgb\(\s*([0-9]+(?:\.[0-9]+)?)\%\s*,\s*([0-9]+(?:\.[0-9]+)?)\%\s*,\s*([0-9]+(?:\.[0-9]+)?)\%\s*\)/.exec(c))return e(2.55 * parseFloat(d[1]), 2.55 * parseFloat(d[2]), 2.55 * parseFloat(d[3]));
        if (d = /rgba\(\s*([0-9]+(?:\.[0-9]+)?)\%\s*,\s*([0-9]+(?:\.[0-9]+)?)\%\s*,\s*([0-9]+(?:\.[0-9]+)?)\%\s*,\s*([0-9]+(?:\.[0-9]+)?)\s*\)/.exec(c))return e(2.55 * parseFloat(d[1]), 2.55 * parseFloat(d[2]), 2.55 * parseFloat(d[3]), parseFloat(d[4]));
        if (d = /#([a-fA-F0-9]{2})([a-fA-F0-9]{2})([a-fA-F0-9]{2})/.exec(c))return e(parseInt(d[1], 16), parseInt(d[2], 16), parseInt(d[3], 16));
        if (d = /#([a-fA-F0-9])([a-fA-F0-9])([a-fA-F0-9])/.exec(c))return e(parseInt(d[1] + d[1], 16), parseInt(d[2] + d[2], 16), parseInt(d[3] + d[3], 16));
        var f = a.trim(c).toLowerCase();
        return"transparent" == f ? e(255, 255, 255, 0) : (d = b[f] || [0, 0, 0], e(d[0], d[1], d[2]))
    };
    var b = {aqua: [0, 255, 255], azure: [240, 255, 255], beige: [245, 245, 220], black: [0, 0, 0], blue: [0, 0, 255], brown: [165, 42, 42], cyan: [0, 255, 255], darkblue: [0, 0, 139], darkcyan: [0, 139, 139], darkgrey: [169, 169, 169], darkgreen: [0, 100, 0], darkkhaki: [189, 183, 107], darkmagenta: [139, 0, 139], darkolivegreen: [85, 107, 47], darkorange: [255, 140, 0], darkorchid: [153, 50, 204], darkred: [139, 0, 0], darksalmon: [233, 150, 122], darkviolet: [148, 0, 211], fuchsia: [255, 0, 255], gold: [255, 215, 0], green: [0, 128, 0], indigo: [75, 0, 130], khaki: [240, 230, 140], lightblue: [173, 216, 230], lightcyan: [224, 255, 255], lightgreen: [144, 238, 144], lightgrey: [211, 211, 211], lightpink: [255, 182, 193], lightyellow: [255, 255, 224], lime: [0, 255, 0], magenta: [255, 0, 255], maroon: [128, 0, 0], navy: [0, 0, 128], olive: [128, 128, 0], orange: [255, 165, 0], pink: [255, 192, 203], purple: [128, 0, 128], violet: [128, 0, 128], red: [255, 0, 0], silver: [192, 192, 192], white: [255, 255, 255], yellow: [255, 255, 0]}
}(jQuery), function (a) {
    function b(b, d, e, f) {
        function g(a, b) {
            b = [vb].concat(b);
            for (var c = 0; c < a.length; ++c)a[c].apply(this, b)
        }

        function h() {
            for (var b = 0; b < f.length; ++b) {
                var c = f[b];
                c.init(vb), c.options && a.extend(!0, hb, c.options)
            }
        }

        function j(b) {
            var c;
            for (a.extend(!0, hb, b), null == hb.xaxis.color && (hb.xaxis.color = hb.grid.color), null == hb.yaxis.color && (hb.yaxis.color = hb.grid.color), null == hb.xaxis.tickColor && (hb.xaxis.tickColor = hb.grid.tickColor), null == hb.yaxis.tickColor && (hb.yaxis.tickColor = hb.grid.tickColor), null == hb.grid.borderColor && (hb.grid.borderColor = hb.grid.color), null == hb.grid.tickColor && (hb.grid.tickColor = a.color.parse(hb.grid.color).scale("a", .22).toString()), c = 0; c < Math.max(1, hb.xaxes.length); ++c)hb.xaxes[c] = a.extend(!0, {}, hb.xaxis, hb.xaxes[c]);
            for (c = 0; c < Math.max(1, hb.yaxes.length); ++c)hb.yaxes[c] = a.extend(!0, {}, hb.yaxis, hb.yaxes[c]);
            for (hb.xaxis.noTicks && null == hb.xaxis.ticks && (hb.xaxis.ticks = hb.xaxis.noTicks), hb.yaxis.noTicks && null == hb.yaxis.ticks && (hb.yaxis.ticks = hb.yaxis.noTicks), hb.x2axis && (hb.xaxes[1] = a.extend(!0, {}, hb.xaxis, hb.x2axis), hb.xaxes[1].position = "top"), hb.y2axis && (hb.yaxes[1] = a.extend(!0, {}, hb.yaxis, hb.y2axis), hb.yaxes[1].position = "right"), hb.grid.coloredAreas && (hb.grid.markings = hb.grid.coloredAreas), hb.grid.coloredAreasColor && (hb.grid.markingsColor = hb.grid.coloredAreasColor), hb.lines && a.extend(!0, hb.series.lines, hb.lines), hb.points && a.extend(!0, hb.series.points, hb.points), hb.bars && a.extend(!0, hb.series.bars, hb.bars), null != hb.shadowSize && (hb.series.shadowSize = hb.shadowSize), c = 0; c < hb.xaxes.length; ++c)q(nb, c + 1).options = hb.xaxes[c];
            for (c = 0; c < hb.yaxes.length; ++c)q(ob, c + 1).options = hb.yaxes[c];
            for (var d in ub)hb.hooks[d] && hb.hooks[d].length && (ub[d] = ub[d].concat(hb.hooks[d]));
            g(ub.processOptions, [hb])
        }

        function k(a) {
            gb = l(a), r(), s()
        }

        function l(b) {
            for (var c = [], d = 0; d < b.length; ++d) {
                var e = a.extend(!0, {}, hb.series);
                null != b[d].data ? (e.data = b[d].data, delete b[d].data, a.extend(!0, e, b[d]), b[d].data = e.data) : e.data = b[d], c.push(e)
            }
            return c
        }

        function m(a, b) {
            var c = a[b + "axis"];
            return"object" == typeof c && (c = c.n), "number" != typeof c && (c = 1), c
        }

        function n() {
            return a.grep(nb.concat(ob), function (a) {
                return a
            })
        }

        function o(a) {
            var b, c, d = {};
            for (b = 0; b < nb.length; ++b)c = nb[b], c && c.used && (d["x" + c.n] = c.c2p(a.left));
            for (b = 0; b < ob.length; ++b)c = ob[b], c && c.used && (d["y" + c.n] = c.c2p(a.top));
            return void 0 !== d.x1 && (d.x = d.x1), void 0 !== d.y1 && (d.y = d.y1), d
        }

        function p(a) {
            var b, c, d, e = {};
            for (b = 0; b < nb.length; ++b)if (c = nb[b], c && c.used && (d = "x" + c.n, null == a[d] && 1 == c.n && (d = "x"), null != a[d])) {
                e.left = c.p2c(a[d]);
                break
            }
            for (b = 0; b < ob.length; ++b)if (c = ob[b], c && c.used && (d = "y" + c.n, null == a[d] && 1 == c.n && (d = "y"), null != a[d])) {
                e.top = c.p2c(a[d]);
                break
            }
            return e
        }

        function q(b, c) {
            return b[c - 1] || (b[c - 1] = {n: c, direction: b == nb ? "x" : "y", options: a.extend(!0, {}, b == nb ? hb.xaxis : hb.yaxis)}), b[c - 1]
        }

        function r() {
            var b, c = gb.length, d = [], e = [];
            for (b = 0; b < gb.length; ++b) {
                var f = gb[b].color;
                null != f && (--c, "number" == typeof f ? e.push(f) : d.push(a.color.parse(gb[b].color)))
            }
            for (b = 0; b < e.length; ++b)c = Math.max(c, e[b] + 1);
            var g = [], h = 0;
            for (b = 0; g.length < c;) {
                var i;
                i = hb.colors.length == b ? a.color.make(100, 100, 100) : a.color.parse(hb.colors[b]);
                var j = h % 2 == 1 ? -1 : 1;
                i.scale("rgb", 1 + j * Math.ceil(h / 2) * .2), g.push(i), ++b, b >= hb.colors.length && (b = 0, ++h)
            }
            var k, l = 0;
            for (b = 0; b < gb.length; ++b) {
                if (k = gb[b], null == k.color ? (k.color = g[l].toString(), ++l) : "number" == typeof k.color && (k.color = g[k.color].toString()), null == k.lines.show) {
                    var n, o = !0;
                    for (n in k)if (k[n] && k[n].show) {
                        o = !1;
                        break
                    }
                    o && (k.lines.show = !0)
                }
                k.xaxis = q(nb, m(k, "x")), k.yaxis = q(ob, m(k, "y"))
            }
        }

        function s() {
            function b(a, b, c) {
                b < a.datamin && b != -q && (a.datamin = b), c > a.datamax && c != q && (a.datamax = c)
            }

            var c, d, e, f, h, i, j, k, l, m, o = Number.POSITIVE_INFINITY, p = Number.NEGATIVE_INFINITY, q = Number.MAX_VALUE;
            for (a.each(n(), function (a, b) {
                b.datamin = o, b.datamax = p, b.used = !1
            }), c = 0; c < gb.length; ++c)h = gb[c], h.datapoints = {points: []}, g(ub.processRawData, [h, h.data, h.datapoints]);
            for (c = 0; c < gb.length; ++c) {
                h = gb[c];
                var r = h.data, s = h.datapoints.format;
                if (s || (s = [], s.push({x: !0, number: !0, required: !0}), s.push({y: !0, number: !0, required: !0}), (h.bars.show || h.lines.show && h.lines.fill) && (s.push({y: !0, number: !0, required: !1, defaultValue: 0}), h.bars.horizontal && (delete s[s.length - 1].y, s[s.length - 1].x = !0)), h.datapoints.format = s), null == h.datapoints.pointsize)for (h.datapoints.pointsize = s.length, j = h.datapoints.pointsize, i = h.datapoints.points, insertSteps = h.lines.show && h.lines.steps, h.xaxis.used = h.yaxis.used = !0, d = e = 0; d < r.length; ++d, e += j) {
                    m = r[d];
                    var t = null == m;
                    if (!t)for (f = 0; j > f; ++f)k = m[f], l = s[f], l && (l.number && null != k && (k = +k, isNaN(k) ? k = null : 1 / 0 == k ? k = q : k == -1 / 0 && (k = -q)), null == k && (l.required && (t = !0), null != l.defaultValue && (k = l.defaultValue))), i[e + f] = k;
                    if (t)for (f = 0; j > f; ++f)k = i[e + f], null != k && (l = s[f], l.x && b(h.xaxis, k, k), l.y && b(h.yaxis, k, k)), i[e + f] = null; else if (insertSteps && e > 0 && null != i[e - j] && i[e - j] != i[e] && i[e - j + 1] != i[e + 1]) {
                        for (f = 0; j > f; ++f)i[e + j + f] = i[e + f];
                        i[e + 1] = i[e - j + 1], e += j
                    }
                }
            }
            for (c = 0; c < gb.length; ++c)h = gb[c], g(ub.processDatapoints, [h, h.datapoints]);
            for (c = 0; c < gb.length; ++c) {
                h = gb[c], i = h.datapoints.points, j = h.datapoints.pointsize;
                var u = o, v = o, w = p, x = p;
                for (d = 0; d < i.length; d += j)if (null != i[d])for (f = 0; j > f; ++f)k = i[d + f], l = s[f], l && k != q && k != -q && (l.x && (u > k && (u = k), k > w && (w = k)), l.y && (v > k && (v = k), k > x && (x = k)));
                if (h.bars.show) {
                    var y = "left" == h.bars.align ? 0 : -h.bars.barWidth / 2;
                    h.bars.horizontal ? (v += y, x += y + h.bars.barWidth) : (u += y, w += y + h.bars.barWidth)
                }
                b(h.xaxis, u, w), b(h.yaxis, v, x)
            }
            a.each(n(), function (a, b) {
                b.datamin == o && (b.datamin = null), b.datamax == p && (b.datamax = null)
            })
        }

        function t(c, d) {
            var e = document.createElement("canvas");
            return e.className = d, e.width = qb, e.height = rb, c || a(e).css({position: "absolute", left: 0, top: 0}), a(e).appendTo(b), fb && (e.width = 2 * qb, e.height = 2 * rb, e.style.width = "" + qb + "px", e.style.height = "" + rb + "px"), e.getContext || (e = window.G_vmlCanvasManager.initElement(e)), e.getContext("2d").save(), fb && e.getContext("2d").scale(2, 2), e
        }

        function u() {
            if (qb = b.width(), rb = b.height(), 0 >= qb || 0 >= rb)throw"Invalid dimensions for plot, width = " + qb + ", height = " + rb
        }

        function v(a) {
            a.width != qb && (a.width = qb, fb && (a.width = 2 * qb), a.style.width = "" + qb + "px"), a.height != rb && (a.height = rb, fb && (a.height = 2 * rb), a.style.height = "" + rb + "px");
            var b = a.getContext("2d");
            b.restore(), b.save(), fb && b.scale(2, 2)
        }

        function w() {
            var c, d = b.children("canvas.base"), e = b.children("canvas.overlay");
            0 == d.length || 0 == e ? (b.html(""), b.css({padding: 0}), "static" == b.css("position") && b.css("position", "relative"), u(), ib = t(!0, "base"), jb = t(!1, "overlay"), c = !1) : (ib = d.get(0), jb = e.get(0), c = !0), lb = ib.getContext("2d"), mb = jb.getContext("2d"), kb = a([jb, ib]), c && (b.data("plot").shutdown(), vb.resize(), mb.clearRect(0, 0, qb, rb), kb.unbind(), b.children().not([ib, jb]).remove()), b.data("plot", vb)
        }

        function x() {
            hb.grid.hoverable && (kb.mousemove(V), kb.mouseleave(W)), hb.grid.clickable && kb.click(X), g(ub.bindEvents, [kb])
        }

        function y() {
            xb && clearTimeout(xb), kb.unbind("mousemove", V), kb.unbind("mouseleave", W), kb.unbind("click", X), g(ub.shutdown, [kb])
        }

        function z(a) {
            function b(a) {
                return a
            }

            var c, d, e = a.options.transform || b, f = a.options.inverseTransform;
            "x" == a.direction ? (c = a.scale = sb / Math.abs(e(a.max) - e(a.min)), d = Math.min(e(a.max), e(a.min))) : (c = a.scale = tb / Math.abs(e(a.max) - e(a.min)), c = -c, d = Math.max(e(a.max), e(a.min))), a.p2c = e == b ? function (a) {
                return(a - d) * c
            } : function (a) {
                return(e(a) - d) * c
            }, a.c2p = f ? function (a) {
                return f(d + a / c)
            } : function (a) {
                return d + a / c
            }
        }

        function A(c) {
            function d(d, e) {
                return a('<div style="position:absolute;top:-10000px;' + e + 'font-size:smaller"><div class="' + c.direction + "Axis " + c.direction + c.n + 'Axis">' + d.join("") + "</div></div>").appendTo(b)
            }

            var e, f, g, h = c.options, i = c.ticks || [], j = [], k = h.labelWidth, l = h.labelHeight;
            if ("x" == c.direction) {
                if (null == k && (k = Math.floor(qb / (i.length > 0 ? i.length : 1))), null == l) {
                    for (j = [], e = 0; e < i.length; ++e)f = i[e].label, f && j.push('<div class="tickLabel" style="float:left;width:' + k + 'px">' + f + "</div>");
                    j.length > 0 && (j.push('<div style="clear:left"></div>'), g = d(j, "width:10000px;"), l = g.height(), g.remove())
                }
            } else if (null == k || null == l) {
                for (e = 0; e < i.length; ++e)f = i[e].label, f && j.push('<div class="tickLabel">' + f + "</div>");
                j.length > 0 && (g = d(j, ""), null == k && (k = g.children().width()), null == l && (l = g.find("div.tickLabel").height()), g.remove())
            }
            null == k && (k = 0), null == l && (l = 0), c.labelWidth = k, c.labelHeight = l
        }

        function B(b) {
            var c = b.labelWidth, d = b.labelHeight, e = b.options.position, f = b.options.tickLength, g = hb.grid.axisMargin, h = hb.grid.labelMargin, i = "x" == b.direction ? nb : ob, j = a.grep(i, function (a) {
                return a && a.options.position == e && a.reserveSpace
            });
            a.inArray(b, j) == j.length - 1 && (g = 0), null == f && (f = "full");
            var k = a.grep(i, function (a) {
                return a && a.reserveSpace
            }), l = 0 == a.inArray(b, k);
            l || "full" != f || (f = 5), isNaN(+f) || (h += +f), "x" == b.direction ? (d += h, "bottom" == e ? (pb.bottom += d + g, b.box = {top: rb - pb.bottom, height: d}) : (b.box = {top: pb.top + g, height: d}, pb.top += d + g)) : (c += h, "left" == e ? (b.box = {left: pb.left + g, width: c}, pb.left += c + g) : (pb.right += c + g, b.box = {left: qb - pb.right, width: c})), b.position = e, b.tickLength = f, b.box.padding = h, b.innermost = l
        }

        function C(a) {
            "x" == a.direction ? (a.box.left = pb.left, a.box.width = sb) : (a.box.top = pb.top, a.box.height = tb)
        }

        function D() {
            var b, c = n();
            if (a.each(c, function (a, b) {
                b.show = b.options.show, null == b.show && (b.show = b.used), b.reserveSpace = b.show || b.options.reserveSpace, E(b)
            }), allocatedAxes = a.grep(c, function (a) {
                return a.reserveSpace
            }), pb.left = pb.right = pb.top = pb.bottom = 0, hb.grid.show) {
                for (a.each(allocatedAxes, function (a, b) {
                    F(b), G(b), H(b, b.ticks), A(b)
                }), b = allocatedAxes.length - 1; b >= 0; --b)B(allocatedAxes[b]);
                var d = hb.grid.minBorderMargin;
                if (null == d)for (d = 0, b = 0; b < gb.length; ++b)d = Math.max(d, gb[b].points.radius + gb[b].points.lineWidth / 2);
                for (var e in pb)pb[e] += hb.grid.borderWidth, pb[e] = Math.max(d, pb[e])
            }
            sb = qb - pb.left - pb.right, tb = rb - pb.bottom - pb.top, a.each(c, function (a, b) {
                z(b)
            }), hb.grid.show && (a.each(allocatedAxes, function (a, b) {
                C(b)
            }), M()), T()
        }

        function E(a) {
            var b = a.options, c = +(null != b.min ? b.min : a.datamin), d = +(null != b.max ? b.max : a.datamax), e = d - c;
            if (0 == e) {
                var f = 0 == d ? 1 : .01;
                null == b.min && (c -= f), (null == b.max || null != b.min) && (d += f)
            } else {
                var g = b.autoscaleMargin;
                null != g && (null == b.min && (c -= e * g, 0 > c && null != a.datamin && a.datamin >= 0 && (c = 0)), null == b.max && (d += e * g, d > 0 && null != a.datamax && a.datamax <= 0 && (d = 0)))
            }
            a.min = c, a.max = d
        }

        function F(b) {
            var d, e = b.options;
            d = "number" == typeof e.ticks && e.ticks > 0 ? e.ticks : .3 * Math.sqrt("x" == b.direction ? qb : rb);
            var f, g, h, i, j, k, l, m = (b.max - b.min) / d;
            if ("time" == e.mode) {
                var n = {second: 1e3, minute: 6e4, hour: 36e5, day: 864e5, month: 2592e6, year: 525949.2 * 60 * 1e3}, o = [
                    [1, "second"],
                    [2, "second"],
                    [5, "second"],
                    [10, "second"],
                    [30, "second"],
                    [1, "minute"],
                    [2, "minute"],
                    [5, "minute"],
                    [10, "minute"],
                    [30, "minute"],
                    [1, "hour"],
                    [2, "hour"],
                    [4, "hour"],
                    [8, "hour"],
                    [12, "hour"],
                    [1, "day"],
                    [2, "day"],
                    [3, "day"],
                    [.25, "month"],
                    [.5, "month"],
                    [1, "month"],
                    [2, "month"],
                    [3, "month"],
                    [6, "month"],
                    [1, "year"]
                ], p = 0;
                null != e.minTickSize && (p = "number" == typeof e.tickSize ? e.tickSize : e.minTickSize[0] * n[e.minTickSize[1]]);
                for (var j = 0; j < o.length - 1 && !(m < (o[j][0] * n[o[j][1]] + o[j + 1][0] * n[o[j + 1][1]]) / 2 && o[j][0] * n[o[j][1]] >= p); ++j);
                f = o[j][0], h = o[j][1], "year" == h && (k = Math.pow(10, Math.floor(Math.log(m / n.year) / Math.LN10)), l = m / n.year / k, f = 1.5 > l ? 1 : 3 > l ? 2 : 7.5 > l ? 5 : 10, f *= k), b.tickSize = e.tickSize || [f, h], g = function (a) {
                    var b = [], d = a.tickSize[0], e = a.tickSize[1], f = new Date(a.min), g = d * n[e];
                    "second" == e && f.setUTCSeconds(c(f.getUTCSeconds(), d)), "minute" == e && f.setUTCMinutes(c(f.getUTCMinutes(), d)), "hour" == e && f.setUTCHours(c(f.getUTCHours(), d)), "month" == e && f.setUTCMonth(c(f.getUTCMonth(), d)), "year" == e && f.setUTCFullYear(c(f.getUTCFullYear(), d)), f.setUTCMilliseconds(0), g >= n.minute && f.setUTCSeconds(0), g >= n.hour && f.setUTCMinutes(0), g >= n.day && f.setUTCHours(0), g >= 4 * n.day && f.setUTCDate(1), g >= n.year && f.setUTCMonth(0);
                    var h, i = 0, j = Number.NaN;
                    do if (h = j, j = f.getTime(), b.push(j), "month" == e)if (1 > d) {
                        f.setUTCDate(1);
                        var k = f.getTime();
                        f.setUTCMonth(f.getUTCMonth() + 1);
                        var l = f.getTime();
                        f.setTime(j + i * n.hour + (l - k) * d), i = f.getUTCHours(), f.setUTCHours(0)
                    } else f.setUTCMonth(f.getUTCMonth() + d); else"year" == e ? f.setUTCFullYear(f.getUTCFullYear() + d) : f.setTime(j + g); while (j < a.max && j != h);
                    return b
                }, i = function (b, c) {
                    var d = new Date(b);
                    if (null != e.timeformat)return a.plot.formatDate(d, e.timeformat, e.monthNames);
                    var f = c.tickSize[0] * n[c.tickSize[1]], g = c.max - c.min, h = e.twelveHourClock ? " %p" : "";
                    return fmt = f < n.minute ? "%h:%M:%S" + h : f < n.day ? g < 2 * n.day ? "%h:%M" + h : "%b %d %h:%M" + h : f < n.month ? "%b %d" : f < n.year ? g < n.year ? "%b" : "%b %y" : "%y", a.plot.formatDate(d, fmt, e.monthNames)
                }
            } else {
                var q = e.tickDecimals, r = -Math.floor(Math.log(m) / Math.LN10);
                null != q && r > q && (r = q), k = Math.pow(10, -r), l = m / k, 1.5 > l ? f = 1 : 3 > l ? (f = 2, l > 2.25 && (null == q || q >= r + 1) && (f = 2.5, ++r)) : f = 7.5 > l ? 5 : 10, f *= k, null != e.minTickSize && f < e.minTickSize && (f = e.minTickSize), b.tickDecimals = Math.max(0, null != q ? q : r), b.tickSize = e.tickSize || f, g = function (a) {
                    var b, d = [], e = c(a.min, a.tickSize), f = 0, g = Number.NaN;
                    do b = g, g = e + f * a.tickSize, d.push(g), ++f; while (g < a.max && g != b);
                    return d
                }, i = function (a, b) {
                    return a.toFixed(b.tickDecimals)
                }
            }
            if (null != e.alignTicksWithAxis) {
                var s = ("x" == b.direction ? nb : ob)[e.alignTicksWithAxis - 1];
                if (s && s.used && s != b) {
                    var t = g(b);
                    if (t.length > 0 && (null == e.min && (b.min = Math.min(b.min, t[0])), null == e.max && t.length > 1 && (b.max = Math.max(b.max, t[t.length - 1]))), g = function (a) {
                        var b, c, d = [];
                        for (c = 0; c < s.ticks.length; ++c)b = (s.ticks[c].v - s.min) / (s.max - s.min), b = a.min + b * (a.max - a.min), d.push(b);
                        return d
                    }, "time" != b.mode && null == e.tickDecimals) {
                        var u = Math.max(0, -Math.floor(Math.log(m) / Math.LN10) + 1), v = g(b);
                        v.length > 1 && /\..*0$/.test((v[1] - v[0]).toFixed(u)) || (b.tickDecimals = u)
                    }
                }
            }
            b.tickGenerator = g, b.tickFormatter = a.isFunction(e.tickFormatter) ? function (a, b) {
                return"" + e.tickFormatter(a, b)
            } : i
        }

        function G(b) {
            var c = b.options.ticks, d = [];
            null == c || "number" == typeof c && c > 0 ? d = b.tickGenerator(b) : c && (d = a.isFunction(c) ? c({min: b.min, max: b.max}) : c);
            var e, f;
            for (b.ticks = [], e = 0; e < d.length; ++e) {
                var g = null, h = d[e];
                "object" == typeof h ? (f = +h[0], h.length > 1 && (g = h[1])) : f = +h, null == g && (g = b.tickFormatter(f, b)), isNaN(f) || b.ticks.push({v: f, label: g})
            }
        }

        function H(a, b) {
            a.options.autoscaleMargin && b.length > 0 && (null == a.options.min && (a.min = Math.min(a.min, b[0].v)), null == a.options.max && b.length > 1 && (a.max = Math.max(a.max, b[b.length - 1].v)))
        }

        function I() {
            lb.clearRect(0, 0, qb, rb);
            var a = hb.grid;
            a.show && a.backgroundColor && K(), a.show && !a.aboveData && L();
            for (var b = 0; b < gb.length; ++b)g(ub.drawSeries, [lb, gb[b]]), N(gb[b]);
            g(ub.draw, [lb]), a.show && a.aboveData && L()
        }

        function J(a, b) {
            var c, d, e, f, g = n();
            for (i = 0; i < g.length; ++i)if (c = g[i], c.direction == b && (f = b + c.n + "axis", a[f] || 1 != c.n || (f = b + "axis"), a[f])) {
                d = a[f].from, e = a[f].to;
                break
            }
            if (a[f] || (c = "x" == b ? nb[0] : ob[0], d = a[b + "1"], e = a[b + "2"]), null != d && null != e && d > e) {
                var h = d;
                d = e, e = h
            }
            return{from: d, to: e, axis: c}
        }

        function K() {
            lb.save(), lb.translate(pb.left, pb.top), lb.fillStyle = eb(hb.grid.backgroundColor, tb, 0, "rgba(255, 255, 255, 0)"), lb.fillRect(0, 0, sb, tb), lb.restore()
        }

        function L() {
            var b;
            lb.save(), lb.translate(pb.left, pb.top);
            var c = hb.grid.markings;
            if (c) {
                if (a.isFunction(c)) {
                    var d = vb.getAxes();
                    d.xmin = d.xaxis.min, d.xmax = d.xaxis.max, d.ymin = d.yaxis.min, d.ymax = d.yaxis.max, c = c(d)
                }
                for (b = 0; b < c.length; ++b) {
                    var e = c[b], f = J(e, "x"), g = J(e, "y");
                    null == f.from && (f.from = f.axis.min), null == f.to && (f.to = f.axis.max), null == g.from && (g.from = g.axis.min), null == g.to && (g.to = g.axis.max), f.to < f.axis.min || f.from > f.axis.max || g.to < g.axis.min || g.from > g.axis.max || (f.from = Math.max(f.from, f.axis.min), f.to = Math.min(f.to, f.axis.max), g.from = Math.max(g.from, g.axis.min), g.to = Math.min(g.to, g.axis.max), (f.from != f.to || g.from != g.to) && (f.from = f.axis.p2c(f.from), f.to = f.axis.p2c(f.to), g.from = g.axis.p2c(g.from), g.to = g.axis.p2c(g.to), f.from == f.to || g.from == g.to ? (lb.beginPath(), lb.strokeStyle = e.color || hb.grid.markingsColor, lb.lineWidth = e.lineWidth || hb.grid.markingsLineWidth, lb.moveTo(f.from, g.from), lb.lineTo(f.to, g.to), lb.stroke()) : (lb.fillStyle = e.color || hb.grid.markingsColor, lb.fillRect(f.from, g.to, f.to - f.from, g.from - g.to))))
                }
            }
            for (var d = n(), h = hb.grid.borderWidth, i = 0; i < d.length; ++i) {
                var j, k, l, m, o = d[i], p = o.box, q = o.tickLength;
                if (o.show && 0 != o.ticks.length) {
                    for (lb.strokeStyle = o.options.tickColor || a.color.parse(o.options.color).scale("a", .22).toString(), lb.lineWidth = 1, "x" == o.direction ? (j = 0, k = "full" == q ? "top" == o.position ? 0 : tb : p.top - pb.top + ("top" == o.position ? p.height : 0)) : (k = 0, j = "full" == q ? "left" == o.position ? 0 : sb : p.left - pb.left + ("left" == o.position ? p.width : 0)), o.innermost || (lb.beginPath(), l = m = 0, "x" == o.direction ? l = sb : m = tb, 1 == lb.lineWidth && (j = Math.floor(j) + .5, k = Math.floor(k) + .5), lb.moveTo(j, k), lb.lineTo(j + l, k + m), lb.stroke()), lb.beginPath(), b = 0; b < o.ticks.length; ++b) {
                        var r = o.ticks[b].v;
                        l = m = 0, r < o.min || r > o.max || "full" == q && h > 0 && (r == o.min || r == o.max) || ("x" == o.direction ? (j = o.p2c(r), m = "full" == q ? -tb : q, "top" == o.position && (m = -m)) : (k = o.p2c(r), l = "full" == q ? -sb : q, "left" == o.position && (l = -l)), 1 == lb.lineWidth && ("x" == o.direction ? j = Math.floor(j) + .5 : k = Math.floor(k) + .5), lb.moveTo(j, k), lb.lineTo(j + l, k + m))
                    }
                    lb.stroke()
                }
            }
            h && (lb.lineWidth = h, lb.strokeStyle = hb.grid.borderColor, lb.strokeRect(-h / 2, -h / 2, sb + h, tb + h)), lb.restore()
        }

        function M() {
            b.find(".tickLabels").remove();
            for (var a = ['<div class="tickLabels" style="font-size:smaller">'], c = n(), d = 0; d < c.length; ++d) {
                var e = c[d], f = e.box;
                if (e.show) {
                    a.push('<div class="' + e.direction + "Axis " + e.direction + e.n + 'Axis" style="color:' + e.options.color + '">');
                    for (var g = 0; g < e.ticks.length; ++g) {
                        var h = e.ticks[g];
                        if (!(!h.label || h.v < e.min || h.v > e.max)) {
                            var i, j = {};
                            "x" == e.direction ? (i = "center", j.left = Math.round(pb.left + e.p2c(h.v) - e.labelWidth / 2), "bottom" == e.position ? j.top = f.top + f.padding : j.bottom = rb - (f.top + f.height - f.padding)) : (j.top = Math.round(pb.top + e.p2c(h.v) - e.labelHeight / 2), "left" == e.position ? (j.right = qb - (f.left + f.width - f.padding), i = "right") : (j.left = f.left + f.padding, i = "left")), j.width = e.labelWidth;
                            var k = ["position:absolute", "text-align:" + i];
                            for (var l in j)k.push(l + ":" + j[l] + "px");
                            a.push('<div class="tickLabel" style="' + k.join(";") + '">' + h.label + "</div>")
                        }
                    }
                    a.push("</div>")
                }
            }
            a.push("</div>"), b.append(a.join(""))
        }

        function N(a) {
            a.lines.show && O(a), a.bars.show && R(a), a.points.show && P(a)
        }

        function O(a) {
            function b(a, b, c, d, e) {
                var f = a.points, g = a.pointsize, h = null, i = null;
                lb.beginPath();
                for (var j = g; j < f.length; j += g) {
                    var k = f[j - g], l = f[j - g + 1], m = f[j], n = f[j + 1];
                    if (null != k && null != m) {
                        if (n >= l && l < e.min) {
                            if (n < e.min)continue;
                            k = (e.min - l) / (n - l) * (m - k) + k, l = e.min
                        } else if (l >= n && n < e.min) {
                            if (l < e.min)continue;
                            m = (e.min - l) / (n - l) * (m - k) + k, n = e.min
                        }
                        if (l >= n && l > e.max) {
                            if (n > e.max)continue;
                            k = (e.max - l) / (n - l) * (m - k) + k, l = e.max
                        } else if (n >= l && n > e.max) {
                            if (l > e.max)continue;
                            m = (e.max - l) / (n - l) * (m - k) + k, n = e.max
                        }
                        if (m >= k && k < d.min) {
                            if (m < d.min)continue;
                            l = (d.min - k) / (m - k) * (n - l) + l, k = d.min
                        } else if (k >= m && m < d.min) {
                            if (k < d.min)continue;
                            n = (d.min - k) / (m - k) * (n - l) + l, m = d.min
                        }
                        if (k >= m && k > d.max) {
                            if (m > d.max)continue;
                            l = (d.max - k) / (m - k) * (n - l) + l, k = d.max
                        } else if (m >= k && m > d.max) {
                            if (k > d.max)continue;
                            n = (d.max - k) / (m - k) * (n - l) + l, m = d.max
                        }
                        (k != h || l != i) && lb.moveTo(d.p2c(k) + b, e.p2c(l) + c), h = m, i = n, lb.lineTo(d.p2c(m) + b, e.p2c(n) + c)
                    }
                }
                lb.stroke()
            }

            function c(a, b, c) {
                for (var d = a.points, e = a.pointsize, f = Math.min(Math.max(0, c.min), c.max), g = 0, h = !1, i = 1, j = 0, k = 0; ;) {
                    if (e > 0 && g > d.length + e)break;
                    g += e;
                    var l = d[g - e], m = d[g - e + i], n = d[g], o = d[g + i];
                    if (h) {
                        if (e > 0 && null != l && null == n) {
                            k = g, e = -e, i = 2;
                            continue
                        }
                        if (0 > e && g == j + e) {
                            lb.fill(), h = !1, e = -e, i = 1, g = j = k + e;
                            continue
                        }
                    }
                    if (null != l && null != n) {
                        if (n >= l && l < b.min) {
                            if (n < b.min)continue;
                            m = (b.min - l) / (n - l) * (o - m) + m, l = b.min
                        } else if (l >= n && n < b.min) {
                            if (l < b.min)continue;
                            o = (b.min - l) / (n - l) * (o - m) + m, n = b.min
                        }
                        if (l >= n && l > b.max) {
                            if (n > b.max)continue;
                            m = (b.max - l) / (n - l) * (o - m) + m, l = b.max
                        } else if (n >= l && n > b.max) {
                            if (l > b.max)continue;
                            o = (b.max - l) / (n - l) * (o - m) + m, n = b.max
                        }
                        if (h || (lb.beginPath(), lb.moveTo(b.p2c(l), c.p2c(f)), h = !0), m >= c.max && o >= c.max)lb.lineTo(b.p2c(l), c.p2c(c.max)), lb.lineTo(b.p2c(n), c.p2c(c.max)); else if (m <= c.min && o <= c.min)lb.lineTo(b.p2c(l), c.p2c(c.min)), lb.lineTo(b.p2c(n), c.p2c(c.min)); else {
                            var p = l, q = n;
                            o >= m && m < c.min && o >= c.min ? (l = (c.min - m) / (o - m) * (n - l) + l, m = c.min) : m >= o && o < c.min && m >= c.min && (n = (c.min - m) / (o - m) * (n - l) + l, o = c.min), m >= o && m > c.max && o <= c.max ? (l = (c.max - m) / (o - m) * (n - l) + l, m = c.max) : o >= m && o > c.max && m <= c.max && (n = (c.max - m) / (o - m) * (n - l) + l, o = c.max), l != p && lb.lineTo(b.p2c(p), c.p2c(m)), lb.lineTo(b.p2c(l), c.p2c(m)), lb.lineTo(b.p2c(n), c.p2c(o)), n != q && (lb.lineTo(b.p2c(n), c.p2c(o)), lb.lineTo(b.p2c(q), c.p2c(o)))
                        }
                    }
                }
            }

            lb.save(), lb.translate(pb.left, pb.top), lb.lineJoin = "round";
            var d = a.lines.lineWidth, e = a.shadowSize;
            if (d > 0 && e > 0) {
                lb.lineWidth = e, lb.strokeStyle = "rgba(0,0,0,0.1)";
                var f = Math.PI / 18;
                b(a.datapoints, Math.sin(f) * (d / 2 + e / 2), Math.cos(f) * (d / 2 + e / 2), a.xaxis, a.yaxis), lb.lineWidth = e / 2, b(a.datapoints, Math.sin(f) * (d / 2 + e / 4), Math.cos(f) * (d / 2 + e / 4), a.xaxis, a.yaxis)
            }
            lb.lineWidth = d, lb.strokeStyle = a.color;
            var g = S(a.lines, a.color, 0, tb);
            g && (lb.fillStyle = g, c(a.datapoints, a.xaxis, a.yaxis)), d > 0 && b(a.datapoints, 0, 0, a.xaxis, a.yaxis), lb.restore()
        }

        function P(a) {
            function b(a, b, c, d, e, f, g, h) {
                for (var i = a.points, j = a.pointsize, k = 0; k < i.length; k += j) {
                    var l = i[k], m = i[k + 1];
                    null == l || l < f.min || l > f.max || m < g.min || m > g.max || (lb.beginPath(), l = f.p2c(l), m = g.p2c(m) + d, "circle" == h ? lb.arc(l, m, b, 0, e ? Math.PI : 2 * Math.PI, !1) : h(lb, l, m, b, e), lb.closePath(), c && (lb.fillStyle = c, lb.fill()), lb.stroke())
                }
            }

            lb.save(), lb.translate(pb.left, pb.top);
            var c = a.points.lineWidth, d = a.shadowSize, e = a.points.radius, f = a.points.symbol;
            if (c > 0 && d > 0) {
                var g = d / 2;
                lb.lineWidth = g, lb.strokeStyle = "rgba(0,0,0,0.1)", b(a.datapoints, e, null, g + g / 2, !0, a.xaxis, a.yaxis, f), lb.strokeStyle = "rgba(0,0,0,0.2)", b(a.datapoints, e, null, g / 2, !0, a.xaxis, a.yaxis, f)
            }
            lb.lineWidth = c, lb.strokeStyle = a.color, b(a.datapoints, e, S(a.points, a.color), 0, !1, a.xaxis, a.yaxis, f), lb.restore()
        }

        function Q(a, b, c, d, e, f, g, h, i, j, k, l) {
            var m, n, o, p, q, r, s, t, u;
            k ? (t = r = s = !0, q = !1, m = c, n = a, p = b + d, o = b + e, m > n && (u = n, n = m, m = u, q = !0, r = !1)) : (q = r = s = !0, t = !1, m = a + d, n = a + e, o = c, p = b, o > p && (u = p, p = o, o = u, t = !0, s = !1)), n < h.min || m > h.max || p < i.min || o > i.max || (m < h.min && (m = h.min, q = !1), n > h.max && (n = h.max, r = !1), o < i.min && (o = i.min, t = !1), p > i.max && (p = i.max, s = !1), m = h.p2c(m), o = i.p2c(o), n = h.p2c(n), p = i.p2c(p), g && (j.beginPath(), j.moveTo(m, o), j.lineTo(m, p), j.lineTo(n, p), j.lineTo(n, o), j.fillStyle = g(o, p), j.fill()), l > 0 && (q || r || s || t) && (j.beginPath(), j.moveTo(m, o + f), q ? j.lineTo(m, p + f) : j.moveTo(m, p + f), s ? j.lineTo(n, p + f) : j.moveTo(n, p + f), r ? j.lineTo(n, o + f) : j.moveTo(n, o + f), t ? j.lineTo(m, o + f) : j.moveTo(m, o + f), j.stroke()))
        }

        function R(a) {
            function b(b, c, d, e, f, g, h) {
                for (var i = b.points, j = b.pointsize, k = 0; k < i.length; k += j)null != i[k] && Q(i[k], i[k + 1], i[k + 2], c, d, e, f, g, h, lb, a.bars.horizontal, a.bars.lineWidth)
            }

            lb.save(), lb.translate(pb.left, pb.top), lb.lineWidth = a.bars.lineWidth, lb.strokeStyle = a.color;
            var c = "left" == a.bars.align ? 0 : -a.bars.barWidth / 2, d = a.bars.fill ? function (b, c) {
                return S(a.bars, a.color, b, c)
            } : null;
            b(a.datapoints, c, c + a.bars.barWidth, 0, d, a.xaxis, a.yaxis), lb.restore()
        }

        function S(b, c, d, e) {
            var f = b.fill;
            if (!f)return null;
            if (b.fillColor)return eb(b.fillColor, d, e, c);
            var g = a.color.parse(c);
            return g.a = "number" == typeof f ? f : .4, g.normalize(), g.toString()
        }

        function T() {
            if (b.find(".legend").remove(), hb.legend.show) {
                for (var c, d, e = [], f = !1, g = hb.legend.labelFormatter, h = 0; h < gb.length; ++h)c = gb[h], d = c.label, d && (h % hb.legend.noColumns == 0 && (f && e.push("</tr>"), e.push("<tr>"), f = !0), g && (d = g(d, c)), e.push('<td class="legendColorBox"><div style="' + hb.legend.labelBoxBorderColor + '"><div style="border:2px solid ' + c.color + ';overflow:hidden"></div></div></td><td class="legendLabel"><span>' + d + "</span></td>"));
                if (f && e.push("</tr>"), 0 != e.length) {
                    var i = '<table style="font-size: 11px; color:' + hb.grid.color + '">' + e.join("") + "</table>";
                    if (null != hb.legend.container)a(hb.legend.container).html(i); else {
                        var j = "", k = hb.legend.position, l = hb.legend.margin;
                        null == l[0] && (l = [l, l]), "n" == k.charAt(0) ? j += "top:" + (l[1] + pb.top) + "px;" : "s" == k.charAt(0) && (j += "bottom:" + (l[1] + pb.bottom) + "px;"), "e" == k.charAt(1) ? j += "right:" + (l[0] + pb.right) + "px;" : "w" == k.charAt(1) && (j += "left:" + (l[0] + pb.left) + "px;");
                        var m = a('<div class="legend">' + i.replace('style="', 'style="position:absolute;' + j + ";") + "</div>").appendTo(b);
                        if (0 != hb.legend.backgroundOpacity) {
                            var n = hb.legend.backgroundColor;
                            null == n && (n = hb.grid.backgroundColor, n = n && "string" == typeof n ? a.color.parse(n) : a.color.extract(m, "background-color"), n.a = 1, n = n.toString());
                            var o = m.children();
                            a('<div style="position:absolute;width:' + o.width() + "px;height:" + o.height() + "px;" + j + "background-color:" + n + ';"> </div>').prependTo(m).css("opacity", hb.legend.backgroundOpacity)
                        }
                    }
                }
            }
        }

        function U(a, b, c) {
            var d, e, f = hb.grid.mouseActiveRadius, g = f * f + 1, h = null;
            for (d = gb.length - 1; d >= 0; --d)if (c(gb[d])) {
                var i = gb[d], j = i.xaxis, k = i.yaxis, l = i.datapoints.points, m = i.datapoints.pointsize, n = j.c2p(a), o = k.c2p(b), p = f / j.scale, q = f / k.scale;
                if (j.options.inverseTransform && (p = Number.MAX_VALUE), k.options.inverseTransform && (q = Number.MAX_VALUE), i.lines.show || i.points.show)for (e = 0; e < l.length; e += m) {
                    var r = l[e], s = l[e + 1];
                    if (null != r && !(r - n > p || -p > r - n || s - o > q || -q > s - o)) {
                        var t = Math.abs(j.p2c(r) - a), u = Math.abs(k.p2c(s) - b), v = t * t + u * u;
                        g > v && (g = v, h = [d, e / m])
                    }
                }
                if (i.bars.show && !h) {
                    var w = "left" == i.bars.align ? 0 : -i.bars.barWidth / 2, x = w + i.bars.barWidth;
                    for (e = 0; e < l.length; e += m) {
                        var r = l[e], s = l[e + 1], y = l[e + 2];
                        null != r && (gb[d].bars.horizontal ? n <= Math.max(y, r) && n >= Math.min(y, r) && o >= s + w && s + x >= o : n >= r + w && r + x >= n && o >= Math.min(y, s) && o <= Math.max(y, s)) && (h = [d, e / m])
                    }
                }
            }
            return h ? (d = h[0], e = h[1], m = gb[d].datapoints.pointsize, {datapoint: gb[d].datapoints.points.slice(e * m, (e + 1) * m), dataIndex: e, series: gb[d], seriesIndex: d}) : null
        }

        function V(a) {
            hb.grid.hoverable && Y("plothover", a, function (a) {
                return 0 != a.hoverable
            })
        }

        function W(a) {
            hb.grid.hoverable && Y("plothover", a, function () {
                return!1
            })
        }

        function X(a) {
            Y("plotclick", a, function (a) {
                return 0 != a.clickable
            })
        }

        function Y(a, c, d) {
            var e = kb.offset(), f = c.pageX - e.left - pb.left, g = c.pageY - e.top - pb.top, h = o({left: f, top: g});
            h.pageX = c.pageX, h.pageY = c.pageY;
            var i = U(f, g, d);
            if (i && (i.pageX = parseInt(i.series.xaxis.p2c(i.datapoint[0]) + e.left + pb.left), i.pageY = parseInt(i.series.yaxis.p2c(i.datapoint[1]) + e.top + pb.top)), hb.grid.autoHighlight) {
                for (var j = 0; j < wb.length; ++j) {
                    var k = wb[j];
                    k.auto != a || i && k.series == i.series && k.point[0] == i.datapoint[0] && k.point[1] == i.datapoint[1] || ab(k.series, k.point)
                }
                i && _(i.series, i.datapoint, a)
            }
            b.trigger(a, [h, i])
        }

        function Z() {
            xb || (xb = setTimeout($, 30))
        }

        function $() {
            xb = null, mb.save(), mb.clearRect(0, 0, qb, rb), mb.translate(pb.left, pb.top);
            var a, b;
            for (a = 0; a < wb.length; ++a)b = wb[a], b.series.bars.show ? db(b.series, b.point) : cb(b.series, b.point);
            mb.restore(), g(ub.drawOverlay, [mb])
        }

        function _(a, b, c) {
            if ("number" == typeof a && (a = gb[a]), "number" == typeof b) {
                var d = a.datapoints.pointsize;
                b = a.datapoints.points.slice(d * b, d * (b + 1))
            }
            var e = bb(a, b);
            -1 == e ? (wb.push({series: a, point: b, auto: c}), Z()) : c || (wb[e].auto = !1)
        }

        function ab(a, b) {
            null == a && null == b && (wb = [], Z()), "number" == typeof a && (a = gb[a]), "number" == typeof b && (b = a.data[b]);
            var c = bb(a, b);
            -1 != c && (wb.splice(c, 1), Z())
        }

        function bb(a, b) {
            for (var c = 0; c < wb.length; ++c) {
                var d = wb[c];
                if (d.series == a && d.point[0] == b[0] && d.point[1] == b[1])return c
            }
            return-1
        }

        function cb(b, c) {
            var d = c[0], e = c[1], f = b.xaxis, g = b.yaxis;
            if (!(d < f.min || d > f.max || e < g.min || e > g.max)) {
                var h = b.points.radius + b.points.lineWidth / 2;
                mb.lineWidth = h, mb.strokeStyle = a.color.parse(b.color).scale("a", .5).toString();
                var i = 1.5 * h, d = f.p2c(d), e = g.p2c(e);
                mb.beginPath(), "circle" == b.points.symbol ? mb.arc(d, e, i, 0, 2 * Math.PI, !1) : b.points.symbol(mb, d, e, i, !1), mb.closePath(), mb.stroke()
            }
        }

        function db(b, c) {
            mb.lineWidth = b.bars.lineWidth, mb.strokeStyle = a.color.parse(b.color).scale("a", .5).toString();
            var d = a.color.parse(b.color).scale("a", .5).toString(), e = "left" == b.bars.align ? 0 : -b.bars.barWidth / 2;
            Q(c[0], c[1], c[2] || 0, e, e + b.bars.barWidth, 0, function () {
                return d
            }, b.xaxis, b.yaxis, mb, b.bars.horizontal, b.bars.lineWidth)
        }

        function eb(b, c, d, e) {
            if ("string" == typeof b)return b;
            for (var f = lb.createLinearGradient(0, d, 0, c), g = 0, h = b.colors.length; h > g; ++g) {
                var i = b.colors[g];
                if ("string" != typeof i) {
                    var j = a.color.parse(e);
                    null != i.brightness && (j = j.scale("rgb", i.brightness)), null != i.opacity && (j.a *= i.opacity), i = j.toString()
                }
                f.addColorStop(g / (h - 1), i)
            }
            return f
        }

        var fb = window.devicePixelRatio > 1, gb = [], hb = {colors: a.flot_color_array || ["#931313", "#638167", "#65596B", "#60747C", "#B09B5B"], legend: {show: !0, noColumns: a.flot_noColumns || 0, labelFormatter: null, labelBoxBorderColor: "", container: null, position: "ne", margin: a.flot_margin || [-5, -32], backgroundColor: a.flot_backgroundColor || "", backgroundOpacity: a.flot_backgroundOpacity || 1}, xaxis: {show: null, position: "bottom", mode: null, color: null, tickColor: null, transform: null, inverseTransform: null, min: null, max: null, autoscaleMargin: null, ticks: null, tickFormatter: null, labelWidth: null, labelHeight: null, reserveSpace: null, tickLength: null, alignTicksWithAxis: null, tickDecimals: null, tickSize: null, minTickSize: null, monthNames: null, timeformat: null, twelveHourClock: !1}, yaxis: {autoscaleMargin: .02, position: "left"}, xaxes: [], yaxes: [], series: {points: {show: !1, radius: 3, lineWidth: 2, fill: !0, fillColor: "#ffffff", symbol: "circle"}, lines: {lineWidth: 2, fill: !1, fillColor: null, steps: !1}, bars: {show: !1, lineWidth: a.flot_bars_lineWidth || 1, barWidth: 1, fill: !0, fillColor: a.flot_bars_fillColor || {colors: [
            {opacity: .7},
            {opacity: 1}
        ]}, align: "left", horizontal: !1}, shadowSize: a.flot_shadowSize || 0}, grid: {show: !0, aboveData: !1, color: a.flot_grid_color || "#545454", backgroundColor: null, borderColor: a.flot_grid_borderColor || "#efefef", tickColor: a.flot_grid_tickColor || "rgba(0,0,0,0.06)", labelMargin: a.flot_grid_labelMargin || 10, axisMargin: 8, borderWidth: a.flot_grid_borderWidth || 0, minBorderMargin: a.flot_grid_minBorderMargin || 10, markings: null, markingsColor: "#f4f4f4", markingsLineWidth: 2, clickable: !1, hoverable: !1, autoHighlight: !0, mouseActiveRadius: a.flot_grid_mouseActiveRadius || 5}, hooks: {}}, ib = null, jb = null, kb = null, lb = null, mb = null, nb = [], ob = [], pb = {left: 0, right: 0, top: 0, bottom: 0}, qb = 0, rb = 0, sb = 0, tb = 0, ub = {processOptions: [], processRawData: [], processDatapoints: [], drawSeries: [], draw: [], bindEvents: [], drawOverlay: [], shutdown: []}, vb = this;
        vb.setData = k, vb.setupGrid = D, vb.draw = I, vb.getPlaceholder = function () {
            return b
        }, vb.getCanvas = function () {
            return ib
        }, vb.getPlotOffset = function () {
            return pb
        }, vb.width = function () {
            return sb
        }, vb.height = function () {
            return tb
        }, vb.offset = function () {
            var a = kb.offset();
            return a.left += pb.left, a.top += pb.top, a
        }, vb.getData = function () {
            return gb
        }, vb.getAxes = function () {
            var b = {};
            return a.each(nb.concat(ob), function (a, c) {
                c && (b[c.direction + (1 != c.n ? c.n : "") + "axis"] = c)
            }), b
        }, vb.getXAxes = function () {
            return nb
        }, vb.getYAxes = function () {
            return ob
        }, vb.c2p = o, vb.p2c = p, vb.getOptions = function () {
            return hb
        }, vb.highlight = _, vb.unhighlight = ab, vb.triggerRedrawOverlay = Z, vb.pointOffset = function (a) {
            return{left: parseInt(nb[m(a, "x") - 1].p2c(+a.x) + pb.left), top: parseInt(ob[m(a, "y") - 1].p2c(+a.y) + pb.top)}
        }, vb.shutdown = y, vb.resize = function () {
            u(), v(ib), v(jb)
        }, vb.hooks = ub, h(vb), j(e), w(), k(d), D(), I(), x();
        var wb = [], xb = null
    }

    function c(a, b) {
        return b * Math.floor(a / b)
    }

    a.plot = function (c, d, e) {
        var f = new b(a(c), d, e, a.plot.plugins);
        return f
    }, a.plot.version = "0.7", a.plot.plugins = [], a.plot.formatDate = function (a, b, c) {
        var d = function (a) {
            return a = "" + a, 1 == a.length ? "0" + a : a
        }, e = [], f = !1, g = !1, h = a.getUTCHours(), i = 12 > h;
        null == c && (c = ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"]), -1 != b.search(/%p|%P/) && (h > 12 ? h -= 12 : 0 == h && (h = 12));
        for (var j = 0; j < b.length; ++j) {
            var k = b.charAt(j);
            if (f) {
                switch (k) {
                    case"h":
                        k = "" + h;
                        break;
                    case"H":
                        k = d(h);
                        break;
                    case"M":
                        k = d(a.getUTCMinutes());
                        break;
                    case"S":
                        k = d(a.getUTCSeconds());
                        break;
                    case"d":
                        k = "" + a.getUTCDate();
                        break;
                    case"m":
                        k = "" + (a.getUTCMonth() + 1);
                        break;
                    case"y":
                        k = "" + a.getUTCFullYear();
                        break;
                    case"b":
                        k = "" + c[a.getUTCMonth()];
                        break;
                    case"p":
                        k = i ? "am" : "pm";
                        break;
                    case"P":
                        k = i ? "AM" : "PM";
                        break;
                    case"0":
                        k = "", g = !0
                }
                k && g && (k = d(k), g = !1), e.push(k), g || (f = !1)
            } else"%" == k ? f = !0 : e.push(k)
        }
        return e.join("")
    }
}(jQuery);