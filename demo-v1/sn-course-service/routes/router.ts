import { Router, Request, Response } from "express";

const router = Router();

router.get('/courses', (req: Request, res: Response)=> {
    res.json({
        ok: true,
        message: 'Everything is working fine!!!'
    });
});

export default router;